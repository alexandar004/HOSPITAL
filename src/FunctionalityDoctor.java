import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FunctionalityDoctor {

    DataConvertor dataConvertor = new DataConvertor();
    Doctor loggedDoctor;

    public void doctorLogIn(Doctor doctor) {
        List<Doctor> doctors = dataConvertor.getDoctors();
        boolean isDoctorLoggedIn = false;
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId() == doctor.getId() &&
                    doctors.get(i).getFirstName().equals(doctor.getFirstName()) &&
                    doctors.get(i).getLastName().equals(doctor.getLastName())) {
                loggedDoctor = doctor;
                printMenu();
                isDoctorLoggedIn = true;
            }
        }
        if (!isDoctorLoggedIn) {
            doctorLogIn(getLogInParameters());
        }
    }

    public Doctor getLogInParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your ID and names");
        System.out.println("ID: ");
        int id = scanner.nextInt();
        System.out.println("First name: ");
        String firstName = scanner.next();
        System.out.println("Last name: ");
        String lastName = scanner.next();

        return new Doctor(id, firstName, lastName);
    }

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("1. Visual all reserved hour a current doctor");
        System.out.println("2. Sort all reserved hours of a doctor by patient name.");
        System.out.println("3. Sort all reserved hours of a doctor by appointment hour.");
        System.out.println("4. Sort all reserved hours of a doctor patient ID.");
        System.out.println("5. Group patients by doctor name.");
        System.out.println("6. Group patients by speciality.");
        System.out.println("7. Group patients by appointment date.");
        System.out.println("------------------------------------------");
        int menuChoice = scanner.nextInt();
        printChosenMenuOption(loggedDoctor, menuChoice);
    }

    private void printChosenMenuOption(Doctor doctor, int menuChoice) {
        switch (menuChoice) {
            case 1 -> printCurrentDoctorAppointments(getAllAppointmentsForCurrentDoctor(doctor));
            case 2 -> printCurrentDoctorAppointments(sortCurrentDoctorAppointmentsByPatientName(getPatientIdByName(enterPatientName())));
            case 3 -> printCurrentDoctorAppointments(sortCurrentDoctorAppointmentsByHour(getAllAppointmentsForCurrentDoctor(doctor)));
            case 4 -> printCurrentDoctorAppointments(sortCurrentDoctorAppointmentsByPatientId(getAllAppointmentsForCurrentDoctor(doctor)));
//            case 5 -> groupPatientsByDoctorName();
//            case 6 -> groupPatientsBySpeciality();
//            case 7 -> groupPatientsByAppointmentDate();
            default -> printMenu();
        }
    }

    public List<Appointments> getAllAppointmentsByDoctorId(int doctorId) {
        List<Appointments> appointments = new ArrayList<>();
        for (Appointments appointment : dataConvertor.getAppointments()) {
            if (appointment.getDoctorId() == doctorId) {
                appointments.add(appointment);
            }
        }
        return appointments;
    }

    public List<Appointments> getAllAppointmentsForCurrentDoctor(Doctor doctor) {
        List<Appointments> appointments = new ArrayList<>();
        for (Appointments appointment : dataConvertor.getAppointments()) {
            if (appointment.getDoctorId() == doctor.getId()) {
                appointments.add(appointment);
            }
        }
        return appointments;
    }

    public void printCurrentDoctorAppointments(List<Appointments> appointments) {
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println(appointments.get(i).appointmentsId + ", " +
                    appointments.get(i).patientId + ", " +
                    appointments.get(i).typeOfExamination + ", " +
                    appointments.get(i).date + ", " +
                    appointments.get(i).time + ", " +
                    appointments.get(i).doctorId);
        }
        printMenu();
    }

    public List<Appointments> sortCurrentDoctorAppointmentsByPatientName(int patientId) {
        List<Appointments> appointmentsByPatientId = new ArrayList<>();
        for (Appointments appointment : dataConvertor.getAppointments()) {
            if (appointment.getPatientId() == patientId) {
                appointmentsByPatientId.add(appointment);
            }
        }
        return appointmentsByPatientId;
    }

    public int getPatientIdByName(String name) {
        Patient patient = null;
        for (Patient p : dataConvertor.getPatients()) {
            if (p.getFirstName().equals(name)) {
                patient = p;
            }
        }
        assert patient != null;
        return patient.getId();
    }

    public String enterPatientName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter patient name: ");
        String name = scanner.next();
        return name;
    }

//    public List<Appointments> sortCurrentDoctorAppointmentsByHourDescending(List<Appointments> appointments) {
//         appointments.sort((a1,a2) -> a1.getTime() > a2.getTime());
//         return appointments;
//    }

    public List<Appointments> sortCurrentDoctorAppointmentsByHour(List<Appointments> appointments) {
        appointments.sort(Comparator.comparing(Appointments::getTime));
        return appointments;
    }

    public List<Appointments> sortCurrentDoctorAppointmentsByPatientId(List<Appointments> appointments) {
        appointments.sort(Comparator.comparing(Appointments::getPatientId));
        return appointments;
    }

//    private List<Patient> groupPatientsBySpeciality(List<Patient> patients) {
//        patients.stream().collect(Collectors.groupingBy(Patient::));
//        return Collections.emptyList();
//    }
//
//    public List<Doctor> groupPatientsByDoctorName(List<Doctor> doctors) {
//        doctors.stream().collect(Collectors.groupingBy(Doctor::getFirstName));
//        return doctors;
//    }
//
//    public List<Patient> groupPatientsByAppointmentDate() {
//        return Collections.emptyList();
//    }
}


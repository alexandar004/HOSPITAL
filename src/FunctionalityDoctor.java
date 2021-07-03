import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FunctionalityDoctor {

    DataConvertor dataConvertor = new DataConvertor();

    public void doctorLogIn(Doctor doctor) {
        List<Doctor> doctors = dataConvertor.getDoctors();
        boolean isDoctorLoggedIn = false;
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getId() == doctor.getId() &&
                    doctors.get(i).getFirstName().equals(doctor.getFirstName()) &&
                    doctors.get(i).getLastName().equals(doctor.getLastName())) {
                printMenu(doctor);
                isDoctorLoggedIn = true;
            }
        }
        if(!isDoctorLoggedIn){
            doctorLogIn(getLogInParameters());
        }
    }

    public Doctor getLogInParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your ID");
        System.out.println("ID: ");
        int id = scanner.nextInt();
        System.out.println("First name: ");
        String firstName = scanner.next();
        System.out.println("Last name: ");
        String lastName = scanner.next();
        System.out.println("-----------------");

        return new Doctor(id, firstName, lastName);
    }

    public void printMenu(Doctor doctor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sort all reserved hours of a doctor by patient name.");
        System.out.println("2. Sort all reserved hours of a doctor by appointment hour.");
        System.out.println("3. Sort all reserved hours of a doctor patient ID.");
        System.out.println("4. Group patients by doctor name.");
        System.out.println("5. Group patients by speciality.");
        System.out.println("6. Group patients by appointment date.");
        int menuChoice = scanner.nextInt();
        switch (menuChoice) {
            case 1 -> printCurrentDoctorAppointments(getAllAppointmentsForCurrentDoctor(doctor));
            case 2 -> sortCurrentDoctorAppointmentsByHour(getAllAppointmentsForCurrentDoctor(doctor));
            case 3 -> sortCurrentDoctorAppointmentsByPatientId(getAllAppointmentsForCurrentDoctor(doctor));
            case 4 -> groupPatientsByDoctorName();
            case 5 -> groupPatientsBySpeciality();
            case 6 -> groupPatientsByAppointmentDate();
            default -> printMenu(doctor);
        }
    }

    public List<Appointments> getAllAppointmentsByDoctorId(int doctorId) {
        List<Appointments> appointments = new ArrayList<>();
        for (Appointments appointment : dataConvertor.appointments) {
            if (appointment.doctorId == doctorId) {
                appointments.add(appointment);
            }
        }
        return appointments;
    }

    public List<Appointments> getAllAppointmentsForCurrentDoctor(Doctor doctor) {
        List<Appointments> appointments = new ArrayList<>();
        for (Appointments appointment : dataConvertor.appointments) {
            if (appointment.doctorId == doctor.getId()) {
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
    }

    public List<Appointments> sortCurrentDoctorAppointmentsByPatientName(List<Appointments> appointments) {
        return Collections.emptyList();
    }

    public List<Appointments> sortCurrentDoctorAppointmentsByHour(List<Appointments> appointments) {
        return Collections.emptyList();
    }

    public List<Appointments> sortCurrentDoctorAppointmentsByPatientId(List<Appointments> appointments) {
        return Collections.emptyList();
    }

    private List<Patient> groupPatientsBySpeciality() {
        return Collections.emptyList();
    }

    public List<Patient> groupPatientsByDoctorName() {
        return Collections.emptyList();
    }

    public List<Patient> groupPatientsByAppointmentDate() {
        return Collections.emptyList();

    }

}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FunctionalityDoctor {
    DataConvertor dataConvertor = new DataConvertor();
    Scanner scanner = new Scanner(System.in);

    public void doctorLogIn(Doctor doctor) {
        if (this.dataConvertor.getDoctors().contains(doctor)) {
            Doctor currentDoctor = doctor;
            printMenu(scanner, currentDoctor);
        } else {
            doctorLogIn(getLogInParameters(scanner));
        }
    }

    public Doctor getLogInParameters(Scanner scanner) {
        System.out.println("Please enter your ID and first name");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("First name: ");
        String firstName = scanner.next();
        System.out.print("Last name: ");
        String lastName = scanner.next();

        return new Doctor(id, firstName, lastName);
    }

    public void printMenu(Scanner scanner, Doctor doctor) {
        System.out.println("1. Sort all reserved hours of a doctor by patient name.");
        System.out.println("2. Sort all reserved hours of a doctor by appointment hour.");
        System.out.println("3. Sort all reserved hours of a doctor patient ID.");
        System.out.println("4. Group patients by doctor name.");
        System.out.println("5. Group patients by speciality.");
        System.out.println("6. Group patients by appointment date.");
        int menuChoice = scanner.nextInt();
        switch (menuChoice) {
            case 1:
                sortCurrentDoctorAppointmentsByPatientName(showAllAppointmentsForCurrentDoctor(doctor));
                break;
            case 2:
                sortCurrentDoctorAppointmentsByHour(showAllAppointmentsForCurrentDoctor(doctor));
                break;
            case 3:
                sortCurrentDoctorAppointmentsByPatientId(showAllAppointmentsForCurrentDoctor(doctor));
                break;
            case 4:
                groupPatientsByDoctorName();
                break;
            case 5:
                groupPatientsBySpeciality();
                break;
            case 6:
                groupPatientsByAppointmentDate();
                break;
            default:
                printMenu(scanner, doctor);
        }
    }


    public List<Appointments> showAllAppointmentsForCurrentDoctor(Doctor doctor) {
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
            System.out.println(appointments.get(i));
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


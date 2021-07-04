import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalityPatient {
    DataConvertor dataConvertor = new DataConvertor();
    WriteToAppointments writeToAppointments = new WriteToAppointments();
    FileManager fileManager = new FileManager();

    public void printMenu(Patient patient) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. View all appointments");
        System.out.println("2. Update appointment");
        System.out.println("3. Delete appointment");
        int menuChoice = scanner.nextInt();
        switch (menuChoice) {
            case 1 -> printCurrentPatientAppointments(getAllAppointmentsForCurrentPatient(patient));
            case 2 -> chooseAppointmentToUpdate(patient);
            case 3 -> deleteAppointment(getAllAppointmentsForCurrentPatient(patient));
            default -> printMenu(patient);
        }
    }

    public void deleteAppointment(List<Appointments> allAppointmentsForCurrentPatient) {
        System.out.println("Enter appointment id");
//        dataConvertor.getAppointments().remove(0);
    }

    public void chooseAppointmentToUpdate(Patient patient) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter appointment id to update");
        List<Appointments> appointments = getAllAppointmentsForCurrentPatient(patient);
        printCurrentPatientAppointments(appointments);
        int appointmentId = input.nextInt();
        updateAppointment(appointmentId);
    }

    private void updateAppointment(int id) {
//        writeToAppointments(app);
    }

    public List<Appointments> getAllAppointmentsForCurrentPatient(Patient patient) {
        List<Appointments> appointments = new ArrayList<>();
        for (Appointments appointment : dataConvertor.appointments) {
            if (appointment.patientId == patient.getId()) {
                appointments.add(appointment);
            }
        }
        return appointments;
    }

    public void printCurrentPatientAppointments(List<Appointments> appointments) {
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println(appointments.get(i).appointmentsId + ", " +
                    appointments.get(i).patientId + ", " +
                    appointments.get(i).typeOfExamination + ", " +
                    appointments.get(i).date + ", " +
                    appointments.get(i).time + ", " +
                    appointments.get(i).doctorId);
        }
    }

    public Patient loginAsPatient() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter patient name");
        String name = input.next();
        System.out.println("Enter patient id");
        int id = input.nextInt();
        var manager = new FileManager();
        var patients = manager.getPatients();
        List<Patient> patientsList = new ArrayList<Patient>();
        for (int i = 1; i < patients.size(); i++) {
            var patientsRaw = patients.get(i).split(",");
            var patient = new Patient(Integer.parseInt(patientsRaw[0]), patientsRaw[1], patientsRaw[2], Integer.parseInt(patientsRaw[3]));
            patientsList.add(patient);
        }
        var loggedInPatient = patientsList.stream()
                .filter(p -> p.getFirstName().equals(name) && p.getId() == id).findFirst().orElse(null);
        return loggedInPatient;
    }
}

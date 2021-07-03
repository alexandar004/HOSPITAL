import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalityPatient {

    DataConvertor dataConvertor = new DataConvertor();

    public void printMenu(Patient patient) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Visual all reserved hour a current doctor");
//        System.out.println("2. Sort all reserved hours of a doctor by patient name.");
//        System.out.println("3. Sort all reserved hours of a doctor by appointment hour.");
//        System.out.println("4. Sort all reserved hours of a doctor patient ID.");
//        System.out.println("5. Group patients by doctor name.");
//        System.out.println("6. Group patients by speciality.");
//        System.out.println("7. Group patients by appointment date.");
        int menuChoice = scanner.nextInt();
        switch (menuChoice) {
            case 1 -> printCurrentPatientAppointments(getAllAppointmentsForCurrentPatient(patient));
//            case 2 -> sortCurrentDoctorAppointmentsByPatientName(getAllAppointmentsForCurrentDoctor(doctor));
//            case 3 -> sortCurrentDoctorAppointmentsByHour(getAllAppointmentsForCurrentDoctor(doctor));
//            case 4 -> sortCurrentDoctorAppointmentsByPatientId(getAllAppointmentsForCurrentDoctor(doctor));
//            case 5 -> groupPatientsByDoctorName();
//            case 6 -> groupPatientsBySpeciality();
//            case 7 -> groupPatientsByAppointmentDate();
            default -> printMenu(patient);
        }

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

}

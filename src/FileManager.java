import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {
    ReadFile reading = new ReadFile();

    //    BufferedWriter writer = new BufferedWriter ();
//
//
//    private static void write(String text) {
//        try (BufferedWriter bufferedWriter =
//                     new BufferedWriter(new FileWriter("D:\\test.csv"))) {
//            bufferedWriter.write(text);
//        } catch (IOException e) {
//            System.out.println("Exception while writing in the file was thrown");
//            System.out.println(e.getMessage());
//        }
//    }
    public static void writeToAppointments(List<Appointments> appointments) {
        write(convertToString(appointments));

    }

    protected static String convertToString(List<Appointments> appointments) {
        StringBuilder result = new StringBuilder();
        String line = null;
        for (Appointments appointment :
                appointments) {
            if (appointment != null) {
                line = appointment.getAppointmentsId() + "," + appointment.getPatientId() + "," +
                        appointment.getTypeOfExamination() + "," + appointment.getDate() + "," + appointment.getTime() + "," + appointment.getDoctorId();
            }
            if (line != null) {
                result.append("\n").append(line);
            }
        }
        return result.toString();
    }

    protected static void write(String text) {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter("src\\appointments.csv"))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            System.out.println("Exception while writing in the file was thrown");
            System.out.println(e.getMessage());
        }
    }

    String doctorsLink = "D:\\hospital_project\\HOSPITAL\\HOSPITAL\\src\\doctors.csv";
    String patientsLink = "D:\\hospital_project\\HOSPITAL\\HOSPITAL\\src\\patients.csv";
    String appointmentsLink = "D:\\hospital_project\\HOSPITAL\\HOSPITAL\\src\\appointments.csv";

    List<String> doctors = reading.read(doctorsLink);
    List<String> patients = reading.read(patientsLink);
    List<String> appointment = reading.read(appointmentsLink);

    public List<String> getDoctors() {
        return doctors;
    }

    public List<String> getPatients() {
        return patients;
    }

    public List<String> getAppointment() {
        return appointment;
    }
}
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToAppointments {

    public static void writeToAppointments(List<Appointments> appointments){
        write(convertToString(appointments));

    }

    protected static String convertToString(List<Appointments> appointments) {
        StringBuilder result = new StringBuilder();
        String line = null;
        for (Appointments appointment :
                appointments) {
            if (appointment instanceof Appointments) {
                line = appointment.getAppointmentsId() + "," + appointment.getPatientId() + "," +
                        appointment.getTypeOfExamination() + "," + appointment.getDate() + "," + appointment.getTime() + "," + appointment.getDoctorId();
            }
            if(line != null){
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
}
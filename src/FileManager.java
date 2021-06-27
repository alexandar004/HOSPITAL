import java.util.List;

public class FileManager {
    ReadFile reading = new ReadFile();

    String doctorsLink = "M:\\HospitalProject\\src\\doctors.csv";
    String patientsLink = "M:\\HospitalProject\\src\\patients.csv";
    String appointmentsLink = "M:\\HospitalProject\\src\\appointments.csv";

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
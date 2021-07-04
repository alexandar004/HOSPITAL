import utils.FileManager;

import java.util.List;
import java.util.stream.Collectors;

public class DataConvertor {

    FileManager fileManager = new FileManager();

    List<Patient> patients = convertToPatient(fileManager.getPatients());
    List<Doctor> doctors = convertToDoctor(fileManager.getDoctors());
    List<Appointments> appointments = convertToAppointments(fileManager.getAppointment());

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Appointments> getAppointments() {
        return appointments;
    }

    public List<Doctor> convertToDoctor(List<String> data) {
        return data.stream().map(Doctor::convertToDoctor).collect(Collectors.toList());
    }

    public List<Patient> convertToPatient(List<String> data) {
        return data.stream().map(Patient::convertToPatient).collect(Collectors.toList());
    }

    public List<Appointments> convertToAppointments(List<String> data) {
        return data.stream().map(Appointments::convertToAppointments).collect(Collectors.toList());
    }
}

import Enums.Speciality;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataConvertor {
    public static final String SPLIT_REGEX = ",";

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
        List<Doctor> doctor = new ArrayList<>();

        for (String s : data
        ) {
            String[] line = s.split(SPLIT_REGEX);
            Doctor currentDoctor = new Doctor(line[1], line[2], Integer.parseInt(line[0]), Speciality.ENDOCRINOLOGY);
            doctor.add(currentDoctor);
        }
        return doctor;
    }

    public List<Patient> convertToPatient(List<String> data) {
        return data.stream().map(Patient::conwertToPatient).collect(Collectors.toList());
    }

    public List<Appointments> convertToAppointments(List<String> data) {

        return null;
    }


}

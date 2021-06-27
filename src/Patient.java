import java.util.ArrayList;
import java.util.List;

public class Patient extends Human {

    public Patient(int id, String firstName, String lastName, int age) {
        super(id, firstName, lastName, age);
    }

    public static void parseStringsToPatient(List<String> patientsRaw) {
        List<Patient> patients = new ArrayList<>();
    }

    public static Patient convertToPatient(String line) {
        String[] patientsRaw = line.split(",");
        return new Patient(Integer.parseInt(patientsRaw[0]), patientsRaw[1], patientsRaw[2], Integer.parseInt(patientsRaw[3]));
    }
}

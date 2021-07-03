import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Patient extends Human {
    int age;

    public Patient(int id, String firstName, String lastName, int age) {
        super(id, firstName, lastName);
    }

    public static void parseStringsToPatient(List<String> patientsRaw) {
        List<Patient> patients = new ArrayList<>();
    }

    public static Patient convertToPatient(String line) {
        String[] patientsRaw = line.split(",");
        return new Patient(Integer.parseInt(patientsRaw[0]), patientsRaw[1], patientsRaw[2], Integer.parseInt(patientsRaw[3]));
    }
    

    public static Patient loginAsPatient() {
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

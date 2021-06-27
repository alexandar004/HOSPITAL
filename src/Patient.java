import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Patient extends Human {
    Scanner input = new Scanner(System.in);
    String fileNameRead = "patients.csv";

    public Patient(int id, String firstName, String lastName, int age) {
        super(id, firstName, lastName, age);
    }

    public static void parseStringsToPatient(List<String> patientsRaw) {
        List<Patient> patients = new ArrayList<>();
    }

    private static Patient parseLineToPatients(String line) {
        String[] patientsRaw = line.split(",");
        return new Patient(Integer.parseInt(patientsRaw[0]), patientsRaw[1], patientsRaw[2], Integer.parseInt(patientsRaw[3]));
    }
}
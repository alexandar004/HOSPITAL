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
}

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human{

    public Doctor(int id, String firstName, String lastName, int age) {
        super(id, firstName, lastName, age);
    }
    public Doctor(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public static void parseStringsToDoctor(List<String> doctorRaw) {
        List<Doctor> doctors = new ArrayList<>();
    }

    public static Patient convertToDoctor(String line) {
        String[] doctorsRaw = line.split(",");
        return new Patient(Integer.parseInt(doctorsRaw[0]), doctorsRaw[1],
                doctorsRaw[2], Integer.parseInt(doctorsRaw[3]));
    }
}

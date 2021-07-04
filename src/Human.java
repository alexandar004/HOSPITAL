import java.util.Arrays;
import java.util.List;

public abstract class Human {
    private int id;
    private String firstName;
    private String lastName;

    public Human(int id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void listOfPatient() {
        List<Patient> people =
                Arrays.asList(new Patient(1, "Maria", "Petrova", 25),
                        new Patient(2, "Ivan", "Ivanov", 34),
                        new Patient(3, "Konstantin", "Marinov", 18),
                        new Patient(4, "Krasimira", "Petkova", 4));
    }
}

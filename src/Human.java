import java.util.Arrays;
import java.util.List;

public class Human {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Human(int id, String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public Human(int id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void listOfPatient() {
        List<Patient> people =
                Arrays.asList(new Patient(1, "Maria", "Petrova", 25),
                        new Patient(2, "Ivan", "Ivanov", 34),
                        new Patient(3, "Konstantin", "Marinov", 18),
                        new Patient(4, "Krasimira", "Petkova", 4));
    }
}

public class Patient extends Human {
    int age;

    public Patient(String firstName, String lastName, int id, int age) {
        super(firstName, lastName, id);
        this.age = age;
    }
}

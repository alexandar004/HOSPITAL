public class Doctor extends Human {
    Speciality speciality;

    public Doctor(int id, String firstName, String lastName, Speciality speciality) {
        super(id, firstName, lastName);
    }

    public Doctor(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}

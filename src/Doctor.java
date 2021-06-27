import Enums.Speciality;

public class Doctor extends Human{
    Speciality speciality;

    public Doctor(String firstName, String lastName, int id, Speciality speciality) {
        super(firstName, lastName, id);
        this.speciality = speciality;
    }
}

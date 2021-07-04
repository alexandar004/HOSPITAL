public class Doctor extends Human {
    Speciality speciality;

    public Doctor(int id, String firstName, String lastName, Speciality speciality) {
        super(id, firstName, lastName);
        this.speciality = speciality;
    }

    public Doctor(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public static Doctor convertToDoctor(String line) {
        String[] doctorRaw = line.split(",");
        return new Doctor (Integer.parseInt(doctorRaw[0]), doctorRaw[1], doctorRaw[2], Speciality.CARDIOLOGY);
    }

}

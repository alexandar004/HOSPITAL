public class Appointments {
    int appointmentsId;
    int patientId;
    Inspection typeOfExamination;
    String date;
    int time;
    int doctorId;

    public Appointments(int appointmentsId, int patientId, Inspection typeOfExamination, String date, int time, int doctorId) {
        this.appointmentsId = appointmentsId;
        this.patientId = patientId;
        this.typeOfExamination = typeOfExamination;
        this.date = date;
        this.time = time;
        this.doctorId = doctorId;
    }

    public static Appointments convertToAppointments(String line) {
        String[] appointmentsId = line.split(",");
        return new Appointments(Integer.parseInt(appointmentsId[0]), Integer.parseInt(appointmentsId[1]), EnumsConverter.enumInspectionFromString(appointmentsId[2]), appointmentsId[3], Integer.parseInt(appointmentsId[4]), Integer.parseInt(appointmentsId[5]));
        //TODO:Fix Inspection
    }

    public static Inspection getEnumFromString(String name) {
        name.toUpperCase();
        return Inspection.CONSULTATION;
    }

    public int getAppointmentsId() {
        return appointmentsId;
    }

    public int getPatientId() {
        return patientId;
    }

    public Inspection getTypeOfExamination() {
        return typeOfExamination;
    }

    public String getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }

    public int getDoctorId() {
        return doctorId;
    }

}

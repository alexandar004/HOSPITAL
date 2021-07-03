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
        return new Appointments(Integer.parseInt(appointmentsId[0]), Integer.parseInt(appointmentsId[1]), Inspection.INITIAL, appointmentsId[3], Integer.parseInt(appointmentsId[4]), Integer.parseInt(appointmentsId[5]));
        //TODO:Fix Inspection
    }

    public static Inspection getEnumFromString(String name){
    name.toUpperCase();
        return Inspection.CONSULTATION;
    }



    public int getAppointmentsId() {
        return appointmentsId;
    }

    public void setAppointmentsId(int appointmentsId) {
        this.appointmentsId = appointmentsId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Inspection getTypeOfExamination() {
        return typeOfExamination;
    }

    public void setTypeOfExamination(Inspection typeOfExamination) {
        this.typeOfExamination = typeOfExamination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
}

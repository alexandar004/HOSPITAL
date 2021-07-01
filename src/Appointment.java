public class Appointment {
    private int appointmentsId;
    private int patientId;
    private String typeOfExamination;
    private String date;
    private int time;
    private int doctorId;

    public Appointment(int appointmentsId, int patientId, String typeOfExamination, String date, int time, int doctorId) {
        this.appointmentsId = appointmentsId;
        this.patientId = patientId;
        this.typeOfExamination = typeOfExamination;
        this.date = date;
        this.time = time;
        this.doctorId = doctorId;
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

    public String getTypeOfExamination() {
        return typeOfExamination;
    }

    public void setTypeOfExamination(String typeOfExamination) {
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

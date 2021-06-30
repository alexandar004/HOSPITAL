public class Appointment {
    int appointmentsId;
    int patientId;
    Inspection typeOfExamination;
    String date;
    int time;
    int doctorId;

    public Appointment(int appointmentsId, int patientId, Inspection typeOfExamination, String date, int time, int doctorId) {
        this.appointmentsId = appointmentsId;
        this.patientId = patientId;
        this.typeOfExamination = typeOfExamination;
        this.date = date;
        this.time = time;
        this.doctorId = doctorId;
    }
}

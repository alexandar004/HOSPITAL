public class TestMain {
    public static void main(String[] args) {
    DataConvertor dataConvertor = new DataConvertor();
        System.out.println(dataConvertor.getAppointments().get(0).typeOfExamination);
        System.out.println(dataConvertor.getAppointments().get(1).typeOfExamination);
        System.out.println(dataConvertor.getAppointments().get(2).typeOfExamination);
        System.out.println(dataConvertor.getAppointments().get(3).typeOfExamination);

    }
}
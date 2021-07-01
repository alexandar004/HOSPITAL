public class TestMain {
    public static void main(String[] args) {
        DataConvertor dataConvertor = new DataConvertor();
        System.out.println(dataConvertor.getDoctors().get(0).getId());
        System.out.println(dataConvertor.getAppointments().get(0).date);
        System.out.println(dataConvertor.getAppointments().get(0).typeOfExamination);
    }
}
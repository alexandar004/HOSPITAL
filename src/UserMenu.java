import java.util.Scanner;

public class UserMenu {

    FunctionalityDoctor functionalityDoctor = new FunctionalityDoctor();

    public void startProgram() {

        System.out.println("Program is run");
        mainChoice();
    }

    public void mainChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doctor 1");
        System.out.println("Patient 2");
        System.out.println("Exit 3");

        int input = scanner.nextInt();

        switch (input) {
            case 1 -> {
                System.out.println("You are doctor");
                functionalityDoctor.doctorLogIn(
                        functionalityDoctor.getLogInParameters());
            }
            case 2 -> {
                System.out.println("You are patient");
                patientChoice();
            }
            case 3 -> {
                System.out.println("Exit");
                System.exit(0);
            }
            default -> {
                System.out.println("Enter 1, 2 or 3");
                mainChoice();
            }
        }
    }

    protected void patientChoice() {
        FunctionalityPatient functionalityPatient = new FunctionalityPatient();
        Patient currentLoggedInPatient = functionalityPatient.loginAsPatient();
        functionalityPatient.printMenu(currentLoggedInPatient);
    }
}
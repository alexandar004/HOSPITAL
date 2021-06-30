import java.util.Scanner;

public class UserMenu {

    DataConvertor dataConvertor = new DataConvertor();

    public static void startProgram() {
        System.out.println("Program is run");
        mainChoice();
    }

    public static void mainChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doctor 1");
        System.out.println("Patient 2");
        System.out.println("Exit 3");

        int input = scanner.nextInt();

        switch (input) {
            case 1 -> {
                System.out.println("You are doctor");
                getLogInParameters(scanner);
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

    public static void doctorChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doctor functional 1, 2, 3 or 4 to turn Back");
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> System.out.println("Doctor functional 1");
            case 2 -> System.out.println("Doctor functional 2");
            case 3 -> System.out.println("Doctor functional 3");
            case 4 -> mainChoice();
            default -> {
                System.out.println("Enter 1, 2, 3 or 4");
                doctorChoice();
            }
        }
    }

    protected static void patientChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Patient functional 1, 2, 3 or 4 to turn Back");
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> System.out.println("Patient functional 1");
            case 2 -> System.out.println("Patient functional 2");
            case 3 -> System.out.println("Patient functional 3");
            case 4 -> mainChoice();
            default -> {
                System.out.println("Enter 1, 2, 3 or 4");
                patientChoice();
            }
        }
    }

    public void doctorLogIn(Doctor doctor) {
        if (this.dataConvertor.getDoctors().contains(doctor)) {

        } else {
            doctorLogIn(getLogInParameters());
        }
    }

    public static Doctor getLogInParameters(Scanner scanner) {
        System.out.println("Please enter your ID, first name and last name");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("First name: ");
        String firstName = scanner.next();
        System.out.print("Last name: ");
        String lastName = scanner.next();

        return new Doctor(id, firstName, lastName);
    }
}
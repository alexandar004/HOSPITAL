import java.util.Scanner;

public class UserMenu {
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
                doctorChoice();
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
    }
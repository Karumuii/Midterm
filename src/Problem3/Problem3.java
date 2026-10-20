package Problem3;

import java.util.Scanner;

public class Problem3 {

    static final String SERVICES[] = {"Counseling", "Academic Consultation", "Career Consultation", "Wellness Assessment"};
    static final double FEES[] = {0, 100, 150, 200};

    static Scanner sc = new Scanner(System.in);

    static String readText(String pro) {
        while (true) {
            System.out.print(pro);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) {
                return s;
            }
            System.out.println("Input cannot be empty.");
        }
    }

    static int readChoice() {
        while (true) {
            System.out.print("Select a service (1-" + SERVICES.length + "): ");
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n >= 1 && n <= SERVICES.length) {
                    return n;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Invalid choice. Enter 1 to " + SERVICES.length + " only.");
        }
    }

    static char readYesNo(String pro) {
        while (true) {
            System.out.print(pro);
            String s = sc.nextLine().trim().toUpperCase();
            if (s.equals("Y") || s.equals("N")) {
                return s.charAt(0);
            }
            System.out.println("Please enter Y or N.");
        }
    }

    static void displayMenu() {
        System.out.println("\n=== STUDENT WELLNESS SERVICES ===");
        System.out.println("Choice | Service | Fee");
        for (int i = 0; i < SERVICES.length; i++) {
            System.out.println((i + 1) + " | " + SERVICES[i] + " | P" + FEES[i]);
        }
    }

    public static void main(String[] args) {
        char another;
        do {
            String id = readText("Enter student ID: ");
            String name = readText("Enter student name: ");
            StudentAppointment appointment = new StudentAppointment(id, name);

            displayMenu();
            int choice = readChoice();

            switch (choice) {
                case 1:
                    appointment.assignService(SERVICES[0], FEES[0]);
                    break;
                case 2:
                    appointment.assignService(SERVICES[1], FEES[1]);
                    break;
                case 3:
                    appointment.assignService(SERVICES[2], FEES[2]);
                    break;
                case 4:
                    appointment.assignService(SERVICES[3], FEES[3]);
                    break;
            }

            appointment.displayAppointment();
            another = readYesNo("\nMake another appointment? (Y/N): ");
        } while (another == 'Y');

        System.out.println("Thank you!");
    }
}

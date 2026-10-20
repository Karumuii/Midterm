package Problem5;

import java.util.Scanner;

public class Problem5 {

    static Scanner sc = new Scanner(System.in);

    static int readChoice(int max) {
        while (true) {
            System.out.print("Select a service: ");
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n >= 1 && n <= max) {
                    return n;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Invalid choice. Enter 1 to " + max + " only.");
        }
    }

    static String readDescription() {
        while (true) {
            System.out.print("Enter request description: ");
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) {
                return s;
            }
            System.out.println("Request description cannot be empty.");
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

    public static void main(String[] args) {
        ServiceRequest services[] = {new ITSupport(), new Maintenance(), new LibraryAssistance()};

        char again;
        do {
            System.out.println("\n=== UNIVERSITY SERVICE REQUEST SYSTEM ===");
            for (int i = 0; i < services.length; i++) {
                System.out.println((i + 1) + ". " + services[i].getServiceName());
            }

            int choice = readChoice(services.length);

            ServiceRequest selected = null;
            switch (choice) {
                case 1:
                    selected = services[0];
                    break;
                case 2:
                    selected = services[1];
                    break;
                case 3:
                    selected = services[2];
                    break;
            }

            String description = readDescription();
            System.out.println("\n[" + selected.getServiceName() + "]");
            System.out.println(selected.submitRequest(description));

            again = readYesNo("\nSubmit another request? (Y/N): ");
        } while (again == 'Y');

        System.out.println("Thank you for using the Service Request System.");
    }
}

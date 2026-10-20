package Problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

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

    static int readInt(String pro, int min, int max) {
        while (true) {
            System.out.print(pro);
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n >= min && n <= max) {
                    return n;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Invalid input. Enter a number from " + min + " to " + max + ".");
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
        ArrayList<CampusRequester> requests = new ArrayList<>();
        char again;
        do {
            System.out.println("\n=== CAMPUS SERVICE REQUEST SYSTEM ===");
            System.out.println("1. Student\n2. Faculty");
            int type = readInt("Requester type: ", 1, 2);
            String id = readText("ID: ");
            String name = readText("Name: ");

            CampusRequester requester;
            if (type == 1) {
                requester = new StudentRequester(id, name);
            } else {
                requester = new FacultyRequester(id, name);
            }

            String services[] = requester.getServices();
            System.out.println("\nAvailable services:");
            for (int i = 0; i < services.length; i++) {
                System.out.println((i + 1) + ". " + services[i]);
            }

            int choice = readInt("Choose a service: ", 1, services.length);
            String description = readText("Request description: ");

            requester.submitRequest(choice, description);
            requests.add(requester);

            again = readYesNo("\nSubmit another request? (Y/N): ");
        } while (again == 'Y');

        System.out.println("\nTotal requests submitted: " + requests.size());
        for (CampusRequester r : requests) {
            System.out.println("- " + r.getType() + ": " + r.getName() + " (" + r.getId() + ")");
        }
    }
}

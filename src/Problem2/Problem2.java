package Problem2;

import java.util.Scanner;

public class Problem2 {

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

    static double readDouble(String pro) {
        while (true) {
            System.out.print(pro);
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
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
        System.out.println("=== STUDENT ACCOUNT SYSTEM ===");
        String id = readText("Student ID: ");
        String name = readText("Student Name: ");

        double balance;
        while (true) {
            balance = readDouble("Tuition Balance: P");
            if (balance >= 0) {
                break;
            }
            System.out.println("Tuition balance cannot be negative.");
        }

        StudentAccount account = new StudentAccount(id, name, balance);
        System.out.println();
        account.displayAccount();

        char again;
        do {
            if (account.getTuitionBalance() == 0) {
                System.out.println("\nTuition is fully paid.");
                break;
            }
            double payment = readDouble("\nEnter payment amount: P");
            account.makePayment(payment);
            again = readYesNo("Make another payment? (Y/N): ");
        } while (again == 'Y');

        System.out.println("\n--- Final Account Status ---");
        account.displayAccount();
    }
}

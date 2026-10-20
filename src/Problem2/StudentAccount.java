package Problem2;

public class StudentAccount {

    private String studentId;
    private String studentName;
    private double tuitionBalance;

    public StudentAccount(String studentId, String studentName, double tuitionBalance) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.tuitionBalance = tuitionBalance;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getTuitionBalance() {
        return tuitionBalance;
    }

    public boolean makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Payment must be greater than P0.");
            return false;
        }
        if (amount > tuitionBalance) {
            System.out.println("Payment of P" + amount + " exceeds the remaining balance of P " + tuitionBalance + ". Transaction denied.");
            return false;
        }
        tuitionBalance -= amount;
        System.out.println("Payment of P " + amount + " accepted. New balance: P " + tuitionBalance);
        return true;
    }

    public void displayAccount() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Balance      : P " + tuitionBalance);
    }
}

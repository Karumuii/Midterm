package Problem3;

public class StudentAppointment {

    private String studentId;
    private String studentName;
    private String service;
    private double fee;

    public StudentAppointment(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void assignService(String service, double fee) {
        this.service = service;
        this.fee = fee;
    }

    public void displayAppointment() {
        System.out.println("\n--- Appointment Details ---");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Service      : " + service);
        System.out.println("Fee          : P " + fee);
    }

}

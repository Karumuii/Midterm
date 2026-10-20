package Problem5;

public class Maintenance extends ServiceRequest {

    public Maintenance() {
        super("Maintenance");
    }

    @Override
    public String process(String description) {
        return "Maintenance evaluated the reported facility problem: \"" + description
                + "\". A staff member will inspect the classroom, electrical or facility issue.";
    }

}

package Problem5;

public class ITSupport extends ServiceRequest {

    public ITSupport() {
        super("IT Support");
    }

    @Override
    public String process(String description) {
        return "IT Support checked the reported technical problem: \"" + description
                + "\". A technician will diagnose your computer, network or software issue.";
    }

}

package Problem1;

public class FacultyRequester extends CampusRequester {

    private static final String SERVICES[] = {
        "Equipment Request", "Classroom Concern", "Technical Support"};

    public FacultyRequester(String id, String name) {
        super(id, name);
    }

    @Override
    public String getType() {
        return "Faculty";
    }

    @Override
    public String[] getServices() {
        return SERVICES;
    }

    @Override
    public String processRequest(String service) {
        return "Faculty request '" + service + "' forwarded to the Administration for priority processing.";
    }

}

package Problem1;

public class StudentRequester extends CampusRequester {

    private static final String SERVICES[] = {
        "Document Request", "Laboratory Concern", "Classroom Concern"
    };

    public StudentRequester(String id, String name) {
        super(id, name);
    }

    @Override
    public String getType() {
        return "Student";
    }

    @Override
    public String[] getServices() {
        return SERVICES;
    }

    @Override
    public String processRequest(String service) {
        return "Student request '" + service + "' forwarded to the Registrar/Department for student processing.";
    }

}

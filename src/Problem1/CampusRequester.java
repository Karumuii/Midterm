package Problem1;

public abstract class CampusRequester {

    private String id;
    private String name;

    public CampusRequester(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();

    public abstract String[] getServices();

    public abstract String processRequest(String service);

    public void submitRequest(int choice, String description) {
        String service = getServices()[choice - 1];
        System.out.println("\n--- Request Submitted ---");
        System.out.println("Requester : " + name + " (" + id + ") - " + getType());
        System.out.println("Service   : " + service);
        System.out.println("Details   : " + description);
        System.out.println("Result    : " + processRequest(service));
    }

}

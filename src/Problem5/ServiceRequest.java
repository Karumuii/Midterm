package Problem5;

public abstract class ServiceRequest {

    private String serviceName;

    public ServiceRequest(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    abstract String process(String description);

    public String submitRequest(String description) {
        if (description == null || description.trim().isEmpty()) {
            return "Request description cannot be empty.";
        }
        return process(description.trim());
    }

}

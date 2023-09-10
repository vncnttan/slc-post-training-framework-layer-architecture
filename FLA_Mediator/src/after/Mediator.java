package after;

public interface Mediator {
    public void send(Employee from, String message);
    public void register(Employee employee);
}

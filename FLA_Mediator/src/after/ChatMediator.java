package after;

import java.util.ArrayList;

public class ChatMediator implements Mediator {

    ArrayList<Employee> employees;

    public ChatMediator() {
        employees = new ArrayList<>();
    }

    @Override
    public void send(Employee from, String message) {
        for (Employee e: employees){
            e.receive(from, message);
        }
    }

    @Override
    public void register(Employee employee) {
        employees.add(employee);
    }
}

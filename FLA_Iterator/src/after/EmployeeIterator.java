package after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class EmployeeIterator implements Iterator<Employee> {
    private ArrayList<Employee> employees = new ArrayList<>();
    private int curr;

    public EmployeeIterator(ArrayList<Employee> employees) {
        this.curr = 0;
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return curr < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(curr++);
    }
}

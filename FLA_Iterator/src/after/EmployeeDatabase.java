package after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeDatabase implements Iterable<Employee> {
	
	ArrayList<Employee> employeeList;

	public EmployeeDatabase() {
		employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("A", "A1", 20000));
		employeeList.add(new Employee("B", "B1", 70000));
		employeeList.add(new Employee("C", "C1", 900000));
	}

	@Override
	public Iterator<Employee> iterator() {
		return new EmployeeIterator(employeeList);
	}
}

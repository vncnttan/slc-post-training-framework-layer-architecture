package before;

import java.util.Vector;

public class EmployeeDatabase {
	
	Vector<Employee> employeeList;

	public EmployeeDatabase() {
		employeeList = new Vector<>();
		
		employeeList.add(new Employee("A", "A1", 20000));
		employeeList.add(new Employee("B", "B1", 70000));
		employeeList.add(new Employee("C", "C1", 900000));
	}
	
}

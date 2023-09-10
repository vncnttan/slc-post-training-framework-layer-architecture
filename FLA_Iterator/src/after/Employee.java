package after;

public class Employee {
	private String name;
	private String id;
	private int salary;
	
	public Employee(String name, String id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", id='" + id + '\'' +
				", salary=" + salary +
				'}';
	}
}

package before;

public class Employee {
	
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMessage(Employee to, String message) {
		//send message
	}
	
	public void receive(Employee from, String message) {
		System.out.println(this.getName() + " received a message: " + message + " from " + from.getName());
	}

}

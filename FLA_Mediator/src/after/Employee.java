package after;

public class Employee {
	
	private String name;
	private Mediator mediator;

	public Employee(String name, Mediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMessage(String message) {
		mediator.send(this, message);
	}
	
	public void receive(Employee from, String message) {
		System.out.println(this.getName() + " received a message: " + message + " from " + from.getName());
	}

}

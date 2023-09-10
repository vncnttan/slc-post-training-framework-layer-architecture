package after;

public class Chef {

	public Pizza preparePizza(String type, String size, String topping) {
		
		System.out.println("Chef is preparing pizza");
		
		return new Pizza(type, size, topping);
	}
	
}

package after;

public class Demo {
	
	public static void main(String[] args) {
		Pizza p = new PizzaBuilder("Round").addTopping("Cheese").build();
		Pizza p1 = new PizzaBuilder("Round").addCrust("New York Crust").build();

	}

}

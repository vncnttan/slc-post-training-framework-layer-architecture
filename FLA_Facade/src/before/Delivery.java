package before;

public class Delivery {
	
	public void deliverPizza(Pizza pizza, String address) {
		System.out.println(pizza.getSize() + " " + pizza.getType() + " with " + pizza.getTopping() + " have been delivered");
	}

}

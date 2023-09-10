package before;

public class Demo {
	
	public static void main(String[] args) {
		
		String type = "Marinara", topping = "Pepperoni", size = "Large";
		
		String address = "23th Arcewood Street";
		
		Cashier c = new Cashier();
		c.insertOrder(type, size, topping, address);
		
		Chef chef = new Chef();
		Pizza p = chef.preparePizza(type, size, topping);
		
		Delivery d = new Delivery();
		d.deliverPizza(p, address);
		
	}

}

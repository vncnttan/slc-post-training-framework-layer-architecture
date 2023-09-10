package after;

public class Demo {
	
	public static void main(String[] args) {
		
		String type = "Marinara", topping = "Pepperoni", size = "Large";
		
		String address = "23th Arcewood Street";
		
		RestaurantFacade rf = new RestaurantFacade();
		rf.orderPizza(type, size, topping, address);
		
	}

}

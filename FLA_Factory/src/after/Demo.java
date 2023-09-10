package after;

public class Demo {
	public static void main(String[] args) {
		PhoneFactory fact;
		Phone phone;

		fact = new SumsangFactory();
		phone = fact.createPhone();

		phone.call();

		fact = new PineappleFactory();
		phone = fact.createPhone();

		phone.call();
	}
}

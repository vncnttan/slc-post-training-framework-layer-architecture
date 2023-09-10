package after;

public class Dog extends Animal {
	
	private String race;
	
	public Dog(String name, int age, String color, String race) {
		super(name, age, color);
		this.race = race;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void bark() {
		System.out.println("Bark Bark!");
	}

	@Override
	public Clone createClone() {
		Dog dog = null;
		try {
			dog = (Dog) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return dog;
	}
}

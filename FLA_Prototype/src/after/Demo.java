package after;

public class Demo {
    public static void main(String[] args){
        Dog dog = new Dog("Michael", 3, "Black", "Mutt");
        Dog dog1 = (Dog) dog.createClone();
        dog1.setRace("Labrador");

        System.out.println(dog1.getRace());
        System.out.println(dog.getRace());
    }
}

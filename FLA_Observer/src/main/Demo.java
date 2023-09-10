package main;

public class Demo {
    public static void main(String[] args) {
        Store store = new Store(10);

        User user = new User("Michael");
        User user1 = new User("Obed");
        User user2 = new User("William");

        store.addSubscriber(user);
        store.addSubscriber(user1);
        store.addSubscriber(user2);

        store.setStock(14);
    }
}
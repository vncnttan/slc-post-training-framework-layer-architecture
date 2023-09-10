package main;

public class User implements IObserver {
    String name;

    public User(String name ) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getNotification(int oldStock, int newStock) {
        System.out.println("User " + name + " have been notified for stock update");
        System.out.println("Old Stock: " + oldStock);
        System.out.println("New Stock: " + newStock);
    }
}

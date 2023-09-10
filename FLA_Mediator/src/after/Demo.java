package after;

public class Demo {

    public static void main(String[] args) {
        ChatMediator cm = new ChatMediator();
        Employee a = new Employee("Michael", cm);
        Employee b = new Employee("Abed", cm);
        Employee c = new Employee("Mist", cm);

        cm.register(a);
        cm.register(b);
        cm.register(c);

        a.sendMessage("Hello");
        a.sendMessage("Hello AAA");
        c.sendMessage("Hello B");
    }
}

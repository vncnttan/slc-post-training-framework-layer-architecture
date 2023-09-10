package after;


public class Demo {
    public static void main(String[] args) {
        GadgetFactory factory;
        Watch w;
        Phone p;

        factory = new PineappleFactory();
        w = factory.createWatch();
        p = factory.createPhone();

        w.tellTime();
        p.call();
    }
}

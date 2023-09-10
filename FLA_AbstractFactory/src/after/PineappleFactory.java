package after;

public class PineappleFactory implements GadgetFactory{
    @Override
    public Watch createWatch() {
        return new PineappleWatch();
    }

    @Override
    public Phone createPhone() {
        return new PineapplePhone();
    }
}

package after;

public class SumsangFactory implements GadgetFactory {

    @Override
    public Watch createWatch() {
        return new SumsangWatch();
    }

    @Override
    public Phone createPhone() {
        return new SumsangPhone();
    }
}

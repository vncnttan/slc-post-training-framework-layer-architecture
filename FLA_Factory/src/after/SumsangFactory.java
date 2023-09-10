package after;

public class SumsangFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new SumsangPhone();
    }
}

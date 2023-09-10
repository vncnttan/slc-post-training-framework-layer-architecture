package after;

public class PineappleFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new PineapplePhone();
    }
}

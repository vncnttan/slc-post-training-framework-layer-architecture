package after;

public class RedLight extends State {
    public RedLight(TrafficLight tLight) {
        super(tLight);
        System.out.println("Red Light");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        changeState();

    }

    @Override
    public void changeState() {
        tLight.change(new YellowLight(tLight));
    }
}

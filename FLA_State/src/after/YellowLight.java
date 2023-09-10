package after;

public class YellowLight extends State{
    public YellowLight(TrafficLight tLight) {
        super(tLight);
        System.out.println("Yellow Light");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        changeState();
    }

    @Override
    public void changeState() {
        tLight.change(new GreenLight(tLight));
    }
}

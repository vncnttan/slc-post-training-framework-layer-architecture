package after;

public class GreenLight extends State{
    public GreenLight(TrafficLight tLight) {
        super(tLight);
        System.out.println("Green Light");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        changeState();
    }

    @Override
    public void changeState() {
        tLight.change(new RedLight(tLight));
    }
}

package after;

public abstract class State {
    public abstract void changeState();
    TrafficLight tLight;
    public State(TrafficLight tLight) {
        super();
        this.tLight = tLight;
    }
}

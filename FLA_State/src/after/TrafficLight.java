package after;

public class TrafficLight {

//	protected State YellowLightState()
//	private State currState;
//
	public TrafficLight() {
//		currState = new RedLight(this);
		new RedLight(this);
	}
	
	public void change(State state) {
//		this.currState = state;
	}
}

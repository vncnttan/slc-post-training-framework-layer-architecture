package before;

public class TrafficLight {
	
	private Integer currState;
	
	public TrafficLight() {
		currState = 1;
	}
	
	public void change() {
		if(currState == 1) {
			currState++;
			System.out.println("Red Light");
		} else if (currState == 2) {
			currState++;
			System.out.println("Yellow Light");
		} else if (currState == 3) {
			currState = 1;
			System.out.println("Green Light");
		}
	}

}

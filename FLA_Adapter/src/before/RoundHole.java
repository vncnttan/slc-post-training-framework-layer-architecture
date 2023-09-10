package before;

public class RoundHole {
	
	private int diameter;

	public RoundHole(int diameter) {
		super();
		this.diameter = diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public void isFit(RoundPeg roundPeg) {
		if(roundPeg.getDiameter() > this.diameter) {
			System.out.println("This object with diameter " + diameter + " cannot fit");
		}else {
			System.out.println("This object fit");
		}
	}

}

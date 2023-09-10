package after;

public class SquareToRoundAdapter extends RoundPeg {

    // Adaptee -> What to change
    public SquareToRoundAdapter(SquarePeg sp) {
        this.setDiameter((int) (sp.getSide() * Math.sqrt(2)));
    }

    @Override
    public void setDiameter(int diameter) {
        super.setDiameter(diameter);
    }
}

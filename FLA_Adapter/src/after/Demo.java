package after;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        SquarePeg sp = new SquarePeg(5);

        hole.isFit(new SquareToRoundAdapter(sp));
    }
}

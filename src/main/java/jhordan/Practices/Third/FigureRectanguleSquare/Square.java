package jhordan.Practices.Third.FigureRectanguleSquare;

public class Square extends Rectangule {
    public Square(final String tag, final int side) {
        super(tag, side, side);
    }

    /** return the type of figure**/
    public String getFigureType() {
        return "Square";
    }


}

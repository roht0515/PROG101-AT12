package julia.practices.third.figures;

public class Square extends Rectangle {
    public Square(final int side, final String tag) {
        super(side, tag);
    }

    /**
     *
     * @return figure type
     */
    public String getFigureType() {
        return "Square";
    }
}

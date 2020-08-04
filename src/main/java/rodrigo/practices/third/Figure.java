package rodrigo.practices.third;
abstract class Figure {
    protected final static int WHITE = 0;
    protected final static int BLACK = 1;

    protected int color;

    /** Identifier name of a figure */
    protected String identifier;

    /** Every figure has a color */
    Figure(int color) {
        this.color = color;
        identifier = "";
    }

    /** Get the figure color */
    public int getColor() {
        return this.color;
    }

    /** For testing purposes */
    public String whoAmI() {
        if (color == Figure.WHITE) {
            return "WHITE";
        } else {
            return "BLACK";
        }
    }
}

package rodrigo.practices.third;
abstract class Figure {
    protected static final int WHITE = 0;
    protected static final int BLACK = 1;

    protected int color;

    /** Identifier name of a figure */
    protected String identifier;

    /** Every figure has a color */
    Figure(final int color) {
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

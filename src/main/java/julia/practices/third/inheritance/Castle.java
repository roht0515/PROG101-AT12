package julia.practices.third.inheritance;

/** inheritance.Castle */
public class Castle extends Figure {
    public static final int OCHO = 8;
    public Castle(final int color) {
        super(color);
    }

    /**
     *
     * @param
     */
    public void whoAmI() {
        super.whoAmI();
        System.out.println("inheritance.Castle");
    }

    /**
     * inheritance.Castle movement We are supposing an empty board
     */
    public boolean move(final Position origin, final Position destination) {
        return
                // Valid movement
                ((origin.getRow() == destination.getRow()) || (origin.getColumn() == destination
                        .getColumn()))
                        // origin = destination
                        && ((origin.getRow() != destination.getRow()) || (origin.getColumn() != destination
                                .getColumn()))
                        // Inside the bounds
                        && ((origin.getRow() >= 1 && origin.getRow() <= OCHO)
                                && (origin.getColumn() >= 1 && origin.getColumn() <= OCHO)
                                && (destination.getRow() >= 1 && destination.getRow() <= OCHO) && (destination
                                .getColumn() >= 1 && destination.getColumn() <= OCHO));
    }
} // inheritance.Castle

package elizabeth.practices.third.exercise1;

/** Castle */
public class Castle extends Figure {
    private static final int VALUE = 8;
    public Castle(final int color) {
        super(color);
    }

    /**
     *
     * @Method void whoAmI
     */
    public void whoAmI() {
        super.whoAmI();
        System.out.println("Castle");
    }

    /**
     * Castle movement We are supposing an empty board
     */
    public boolean move(final Position origin, final Position destination) {
        return
                // Valid movement
                ((origin.getRow() == destination.getRow()) || (origin.getColumn() == destination.getColumn()))
                &&
                        // origin = destination
                ((origin.getRow() != destination.getRow()) || (origin.getColumn() != destination.getColumn()))
                &&
                        // Inside the bounds
                ((origin.getRow() >= 1 && origin.getRow() <= VALUE)
                                && (origin.getColumn() >= 1 && origin.getColumn() <= VALUE)
                                && (destination.getRow() >= 1 && destination.getRow() <= VALUE)
                                && (destination.getColumn() >= 1 && destination.getColumn() <= VALUE));
    }

    /**
     *
     * @Method void castle
     */
    public void castle() {
        System.out.println("Method of Castle class.");
    }
} // Castle


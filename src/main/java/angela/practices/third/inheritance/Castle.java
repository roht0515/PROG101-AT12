package angela.practices.third.inheritance;

/** Castle */
public class Castle extends Figure {
    private static final int LOW_LIMIT = 1;
    private static final int UP_LIMIT = 8;
    public Castle(final int color) {
        super(color);
    }

    /**
     * print in console who is the object of this class
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
                ((origin.getRow() == destination.getRow()) || (origin.getColumn() == destination
                        .getColumn()))
                            &&
                        // origin = destination
                        ((origin.getRow() != destination.getRow()) || (origin.getColumn() != destination
                                .getColumn()))
                                    &&
                        // Inside the bounds
                        ((origin.getRow() >= LOW_LIMIT && origin.getRow() <= UP_LIMIT)
                                && (origin.getColumn() >= LOW_LIMIT && origin.getColumn() <= UP_LIMIT)
                                && (destination.getRow() >= LOW_LIMIT && destination.getRow() <= UP_LIMIT) && (destination
                                .getColumn() >= 1 && destination.getColumn() <= UP_LIMIT));
    }
} // Castle

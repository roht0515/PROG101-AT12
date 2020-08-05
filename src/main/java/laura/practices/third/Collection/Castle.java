package laura.practices.third.Collection;

/** Castle */
public class Castle extends Figure {

  private static final int ROWS =8;

  public Castle(final int color) {
    super(color);
  }
  /**
   * Method whoAmI
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
      // origin = destination
      && ((origin.getRow() != destination.getRow()) || (origin.getColumn() != destination
            .getColumn()))
        // Inside the bounds
        && ((origin.getRow() >= 1 && origin.getRow() <= ROWS)
            && (origin.getColumn() >= 1 && origin.getColumn() <= ROWS)
            && (destination.getRow() >= 1 && destination.getRow() <= ROWS) && (destination
            .getColumn() >= 1 && destination.getColumn() <= ROWS));
  }
} // Castle

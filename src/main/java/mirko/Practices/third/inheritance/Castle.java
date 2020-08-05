package inheritance;
/** Castle */
public class Castle extends Figure {
  static final int NUMBER_EIGHT = 8;
  public Castle(final int color) {
    super(color);
  }
  /**
  @print Castle
  **/
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
         && ((origin.getRow() >= 1 && origin.getRow() <= NUMBER_EIGHT)
            && (origin.getColumn() >= 1 && origin.getColumn() <= NUMBER_EIGHT)
            && (destination.getRow() >= 1 && destination.getRow() <= NUMBER_EIGHT)
            && (destination.getColumn() >= 1 && destination.getColumn() <= NUMBER_EIGHT));
  }
} // Castle

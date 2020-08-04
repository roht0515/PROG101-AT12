package samuel.practices.third;
/** Castle */
public class Castle extends Figure {

  protected static final int SIZE_BOARD = 8;

  public Castle(final int color) {
    super(color);
  }
  /**
   * whoAmI
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
        .getColumn())) && ((origin.getRow() != destination.getRow()) || (origin.getColumn() != destination
            .getColumn())) && ((origin.getRow() >= 1 && origin.getRow() <= SIZE_BOARD) && (origin.getColumn() >= 1 && origin.getColumn() <= SIZE_BOARD)
            && (destination.getRow() >= 1 && destination.getRow() <= SIZE_BOARD) && (destination
            .getColumn() >= 1 && destination.getColumn() <= SIZE_BOARD));
  }
}

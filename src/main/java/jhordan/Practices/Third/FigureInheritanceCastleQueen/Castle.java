package jhordan.Practices.Third.FigureInheritanceCastleQueen;

/** Castle */
public class Castle extends Figure {
  static final int LIMITCOLUMN = 8;

  public Castle(final int color) {
    super(color);
  }

  /**print the name of the figure**/
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
        ((origin.getRow() >= 1 && origin.getRow() <= LIMITCOLUMN)
            && (origin.getColumn() >= 1 && origin.getColumn() <= LIMITCOLUMN)
            && (destination.getRow() >= 1 && destination.getRow() <= LIMITCOLUMN) && (destination
            .getColumn() >= 1 && destination.getColumn() <= LIMITCOLUMN));
  }
} // Castle

package jhordan.Practices.Third.FigureInheritanceCastleQueen;

/** Queen */
public class Queen extends Figure {
  public Queen(final int color) {
    super(color);
  }

  /**print the name of the Figure**/

  public void whoAmI() {
    super.whoAmI();
    System.out.println("Queen");
  }

  /**
   * Not needed for this exercise.
   */
  public boolean move(final Position origin, final Position destination) {
    // This is not correct, but we will not need it for this exercise
    return true;
  }
} // Queen

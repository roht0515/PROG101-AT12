package laura.practices.third.collection;

/** Queen */
public class Queen extends Figure {
  public Queen(final int color) {
    super(color);
  }

  /**
   * Method WhoAmI
   */
  public void whoAmI() {
    super.whoAmI();
    System.out.print("\nQueen");
  }

  /**
   * Not needed for this exercise.
   */
  public boolean move(final Position origin, final Position destination) {
    // This is not correct, but we will not need it for this exercise
    return true;
  }
} // Queen

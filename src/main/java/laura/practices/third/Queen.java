/** Queen */
public class Queen extends Figure {
  public Queen(int color) {
    super(color);
  }

  public void whoAmI() {
    super.whoAmI();
    System.out.println("Queen");
  }

  /**
   * Not needed for this exercise.
   */
  public boolean move(Position origin, Position destination) {
    // This is not correct, but we will not need it for this exercise
    return true;
  }
} // Queen

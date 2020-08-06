package inheritance;
/**
 * Defines the general behavior of a figure
 * @author JRM
*/
abstract class Figure {
  static final int WHITE = 0;
  static final int BLACK = 1;

  private int color;

  /** Identifier name of a figure */
  private String identifier;

  /** Every figure has a color */
  Figure(final int color) {
    this.color = color;
    this.identifier = "";
  }

  /** Get the figure color */
  public int getColor() {
    return this.color;
  }

  /** General figures behavior */
  public abstract boolean move(Position origin, Position destination);

  /** For testing purposes */
  public void whoAmI() {
    if (color == WHITE) {
      System.out.println("WHITE");
    } else {
      System.out.println("BLACK");
    }
  }

} // Figure

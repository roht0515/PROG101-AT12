package laura.practices.third.collection;

/**
 * Defines the general behavior of a figure
 *
 * @author JRM
 *
 */
abstract class Figure {
  protected static final int WHITE = 0;
  protected static final int BLACK = 1;

  protected int color;

  /** Identifier name of a figure */
  protected String identifier;

  /** Every figure has a color */
  Figure(final int color) {
    this.color = color;
    identifier = "";
  }

  /** Get the figure color */
  public int getColor() {
    return this.color;
  }

  /** General figures behavior */
  public abstract boolean move(Position origin, Position destination);

  /** For testing purposes */
  public void whoAmI() {
    if (color == Figure.WHITE) {
      System.out.println("WHITE");
    } else {
      System.out.println("BLACK");
    }
  }
}

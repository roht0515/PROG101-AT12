package samuel.practices.third.b;
/** Square Figure */
public class Square extends Rectangle {

  private int side;

  public Square(final int side) {
    super(side);
    this.side = side;
  }
  /**
   * return side of the square
   */
  public int getSide() {
    return side;
  }
  /**
   * setSide
   */
  public void setSide(final int side) {
    this.side = side;
    super.setBase(this.side);
    super.setHeight(this.side);
  }
}

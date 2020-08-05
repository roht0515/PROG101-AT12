package samuel.practices.third.b;
/** GeometricFigure */
public class Rectangle extends GeometricFigure {

  private int base;
  private int height;

  public Rectangle() {
    super(Figure.RECTANGLE);
    base = 0;
    height = 0;
  }

  public Rectangle(final int side) {
    super(Figure.SQUARE);
    this.base = side;
    this.height = side;
  }
  /** getBase */
  public int getBase() {
    return this.base;
  }
  /** setBase */
  public void setBase(final int base) {
    this.base = base;
  }
  /** getHeight */
  public int getHeight() {
    return this.height;
  }
  /** setHeight */
  public void setHeight(final int height) {
    this.height = height;
  }
  /** getFigureType */
  public String getFigureType() {
    return "";
  }
  /** return area */
  public double area() {
    double area = base * height;
    this.setArea(area);
    return area;
  }
  /** return drawTxt */
  public void drawTxt() {
    for (int h = 0; h < height; h++) {
      for (int b = 0; b < base; b++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

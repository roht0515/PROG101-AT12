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

  public int getBase() {
    return this.base;
  }

  public int setBase(final int base) {
    return this.base = base;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(final int height) {
    this.height = height;
  }

  public String getFigureType() {
    return "";
  }

  public int area() {
    return base * height;
  }

  public void drawTxt() {
    for (int h = 0; h < height; h++) {
      for (int b = 0; b < base; b++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

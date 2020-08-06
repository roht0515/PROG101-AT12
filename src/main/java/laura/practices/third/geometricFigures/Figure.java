package laura.practices.third.geometricFigures;

/**
 * Defines the general behavior of a figure
 *
 */
abstract class Figure {

  protected String tag = "";
  protected String label = "";
  protected double area;

  /**
   * @return String tag
   */
  public String getTag() {
    return tag;
  }

  /**
   * @return String label
   */
  public String getFigureType() {
    return label;
  }

  public double area() {
    return area;
  }

  public void drawTxt() {
  }

  public void printDescription() {
  }
}

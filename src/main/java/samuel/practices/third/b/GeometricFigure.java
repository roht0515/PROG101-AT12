package samuel.practices.third.b;
/** GeometricFigure */
public class GeometricFigure extends Figure {

  private String type;
  private String tag;
  private double area;

  public GeometricFigure(final String type) {
    this.type = type;
    area = 0.0;
  }
  /** getTag */
  public String getTag() {
    return tag;
  }
  /** getFigureType */
  public String getFigureType() {
    return type;
  }
  /** getArea */
  public double getArea() {
    return area;
  }
  /** setTag */
  public void setTag(final String tag) {
    this.tag = tag;
  }
  /** setFigureType */
  public void setFigureType(final String type) {
    this.type = type;
  }
  /** setArea */
  public void setArea(final double area) {
    this.area = area;
  }
  /** printDescription */
  public final void printDescription() {
    System.out.println("Tag : " + tag);
    System.out.println("Figure Type : " + type);
    System.out.println("Area : " + area);
  }
}

package samuel.practices.third.b;
/** GeometricFigure */
public class GeometricFigure extends Figure {

  private String type;
  private String tag;
  private int area;

  public GeometricFigure(String type) {
    this.type = type;
    area = 0;
  }

  public String getTag() {
    return tag;
  }

  public String getFigureType() {
    return type;
  }

  public int getArea() {
    return area;
  }

  public void  setTag(final String tag){
    this.tag = tag;
  }

  public void setFigureType(final String type){
    this.type = type;
  }

  public void setArea(final int area) {
    this.area = area;
  }

  public void printDescription() {
    System.out.println("Tag :" + tag);
    System.out.println("Figure Type:" + type);
    System.out.println("Area :" + area);
  }
}

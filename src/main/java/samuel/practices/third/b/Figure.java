package samuel.practices.third.b;
/**
 * Defines the general behavior of a figure
 */
abstract class Figure {

  protected static final String SQUARE = "Square";
  protected static final String RECTANGLE = "Rectangle";

  public abstract String getTag();

  public abstract String getFigureType();

  public abstract void setTag(String tag);

  public abstract void setFigureType(String type);

  public abstract void printDescription();

}

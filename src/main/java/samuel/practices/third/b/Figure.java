package samuel.practices.third.b;

/**
 * Defines the general behavior of a figure
 * 
 * 
 */
abstract class Figure {
  
  protected final static String SQUARE = "square";
  protected final static String RECTANGLE = "rectangle";

  public abstract String getTag();

  public abstract String getFigureType();

  public abstract void printDescription();

} // Figure
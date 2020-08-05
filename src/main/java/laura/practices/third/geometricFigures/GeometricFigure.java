package laura.practices.third.geometricFigures;

public class GeometricFigure extends Figure{

    public String tag = "";
    public String label = "";
    private double area1;

    public GeometricFigure(final int color) {
        super(color);
    }

    public GeometricFigure(final int color, final String tag) {
        super(color);
        this.tag = tag;
    }

    /**
     * @return String tag
     */
    public String getTag() {
        return tag;
    }
    /**
     * Method to set String label
     */
    public void setLabel(GeometricFigure gFigure) {
        if (gFigure instanceof Rectangle) {
            this.label = "Rectangle";
        } 
        if (gFigure instanceof Square){
            this.label = "Square";
        }
    }
    /**
     * Method to change String tag
     */
    final public void setTag(final String tag) {
        this.tag = tag;
    }
    /**
     * @return String label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @return area
     */
    final public double getArea(GeometricFigure gFigure){
        if (gFigure instanceof Rectangle) {
            Rectangle tempRectangle = (Rectangle) gFigure;
            area1 = tempRectangle.area();
        } else {
            if (gFigure instanceof Square){
                Square tempSquare = (Square) gFigure;
                area1 = tempSquare.area();
            }
        }
        return area1;
    }
    /**
     * Method to printDescription
     */
    final public void printDescription(GeometricFigure gFigure) {
        setLabel(gFigure);
        System.out.println("Tag: " + tag + "\n"
                            + "Figure Type: "+ getLabel() + "\n"
                            + "Area: " + getArea(gFigure));

    }

    /**
     * @return boolean move
     */
    public boolean move(Position origin, Position destination){
        return true;
    }
}
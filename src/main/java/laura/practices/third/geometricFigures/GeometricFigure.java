package laura.practices.third.geometricFigures;

public class GeometricFigure extends Figure {
    private String tag;
    private String label;
    private double area;

    public GeometricFigure(final String tag) {
       this.tag = tag;
    }
    public GeometricFigure(final String tag, final String label, final double area) {
        this.tag = tag;
        this.label = label;
        this.area = area;
     }
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
    /**
     * @return double area
     */
    public double area() {
        return area;
    }
    /**
     * Method to printDescription
     */
    @Override
    public void printDescription() {
        System.out.print("Tag: " + getTag() + "\n"
                            + "Figure Type: " + getFigureType() + "\n"
                            + "Area: " + area);
    }

    @Override
    public void drawTxt() {

    }
}

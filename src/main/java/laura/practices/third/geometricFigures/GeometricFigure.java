package laura.practices.third.geometricFigures;

public class GeometricFigure extends Figure{

    public GeometricFigure(final String tag) {
        this.tag = tag;
    }

    /**
     * Method to set String label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Method to change String tag
     */
    final public void setTag(final String tag) {
        this.tag = tag;
    }

    /**
     * Method to printDescription
     */
    public void printDescription(GeometricFigure gFigure) {
        System.out.print("Tag: " + tag + "\n"
                            + "Figure Type: "+ label + "\n"
                            + "Area: " + area);
    }
}

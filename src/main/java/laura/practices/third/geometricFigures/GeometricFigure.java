package laura.practices.third.geometricFigures;

public class GeometricFigure extends Figure {

    public GeometricFigure(final String tag) {
        this.tag = tag;
    }

    /**
     * Method to printDescription
     */
    public void printDescription(final GeometricFigure figure) {
        System.out.print("Tag: " + tag + "\n"
                            + "Figure Type: " + label + "\n"
                            + "Area: " + area);
    }
}

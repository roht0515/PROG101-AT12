package jhordan.Practices.Third.FigureRectanguleSquare;

public abstract class GeometricFigure extends Figure {

    private String tag;

    protected GeometricFigure() {
    }


    public final String printDescription(final String tag) {
        return "Tag: " + tag;
    }
    /**Constructor that receives a descriptive label**/
    GeometricFigure(final String tag) {
        this.tag = tag;
    }

    public final String getTag() {
        return tag;
    }
    public final void setTag(final String tag) {
        this.tag = tag;
    }
}

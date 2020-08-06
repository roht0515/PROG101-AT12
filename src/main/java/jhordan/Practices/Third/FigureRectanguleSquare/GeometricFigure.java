package jhordan.Practices.Third.FigureRectanguleSquare;

public abstract class GeometricFigure extends Figure {
    private String tag;

    GeometricFigure(final String tag) {
        this.tag = tag;
    }
    /**returns the tag**/
    @Override
    public String getTag() {
        return tag;
    }

    public abstract String getFigureType();
    public abstract double area();
    public abstract void drawTxt();
    /**return the description of the figure**/
    public void printDescription() {
        System.out.println("Tag:" + getTag() + "\n"
                + "Figure Type:" + getFigureType() + "\n"
                + "Area:" + area());
    }




}

package elizabeth.practices.third.exercise2;

abstract class GeometricFigure extends Figure {
    private String tag;

    GeometricFigure(final String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(final String tag) {
        this.tag = tag;
    }

    public final void printDescription() {
        System.out.println("Tag :" + getTag()
                          + "\nFigure Type:" + getFigureType()
                          + "\nArea :" + area());
    }

    public abstract String getFigureType();
    public abstract double area();
    public abstract void drawTxt();
}

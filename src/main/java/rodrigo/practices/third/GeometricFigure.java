public abstract class GeometricFigure extends Figure {
    private String tag;
    public  GeometricFigure(final String tag) {
        super(1);
        this.tag = tag;
    }

    public final String getTag() {
        return tag;
    }

    public final void setTag(final String tag) {
        this.tag = tag;
    }

    public abstract String getFigureType();
    public abstract double area();
    public abstract String drawTxt();

    public final String printDescription() {
        String res = "Tag: "+getTag() + "\n" +
                "Figure Type: " + getFigureType() +"\n"+
                "Area: " + area();
        return  res;
    }
}

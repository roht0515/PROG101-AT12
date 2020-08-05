package rodrigo.practices.third;
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

    /**
     *
     * @return Type
     */
    public abstract String getFigureType();

    /**
     *
     * @return area
     */
    public abstract double area();

    /**
     *
     * @return drawFigure
     */
    public abstract String drawTxt();

    /**
     *
     * @return print description
     */
    public final String printDescription() {
        String res = "Tag: "+getTag() + "\n" +
                "Figure Type: " + getFigureType() +"\n"+
                "Area: " + area();
        return  res;
    }
}

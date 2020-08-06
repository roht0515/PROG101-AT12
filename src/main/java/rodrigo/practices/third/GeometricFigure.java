package rodrigo.practices.third;
public abstract class GeometricFigure extends AbstractFigure {
    private String tag;
    public  GeometricFigure(final String tag) {
        super.setTag(tag);
        this.tag = super.getTag();
    }

    public final String getTag() {
        return tag;
    }

    public final void setTag(final String tag) {
        this.tag = tag;
    }

    public String getFigureType() {
        return "";
    }
    public double area() {
        return 0.0;
    }
    public String drawTxt() {
        return "";
    }

    public final String printDescription() {
        String res = "Tag: " + getTag() + "\n" +
                "Figure Type: " + getFigureType() + "\n" +
                "Area: " + area();
        return res;
    }
}

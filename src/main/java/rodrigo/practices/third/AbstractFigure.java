package rodrigo.practices.third;
abstract class AbstractFigure {

    private String tag;
    public String getTag() {
        return tag;
    }
    public void setTag(final String tag) {
        this.tag = tag;
    }

    public abstract String getFigureType();

    public abstract double area();

    public abstract String drawTxt();

    public abstract String printDescription();

}

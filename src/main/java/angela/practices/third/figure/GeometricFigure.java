package angela.practices.third.figure;

public abstract class GeometricFigure implements Figure {
    private String tag;
    private String description;
    private String type;
    private double area;

    public GeometricFigure(final String tag) {
        this.tag = tag;
    }

    protected final void setDescription(final String description) {
        this.description = description;
    }

    public final String getDescription() {
        return description;
    }

    protected final void setFigureType(final String type) {
        this.type = type;
    }

    public final String getFigureType() {
        return type;
    }

    public final void printDescription() {
        description = "Tag : " + tag + "\n" + "Figure type : " + type + "\n" + "Area : " + area();
        System.out.println(description);
    }

    /**
     * @return string tag
     */
    public final String getTag() {
        return tag;
    }

    /**
     *
     * @param tag
     */
    protected final void setTag(final String tag) {
        this.tag = tag;
    }
    /**
     * @return double area
     */
    public final double getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    protected final void setArea(final double area) {
        this.area = area;
    }
    public abstract double area();

}

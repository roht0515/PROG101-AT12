package angela.practices.third.figure;

import angela.practices.third.inheritance.Figure;
import angela.practices.third.inheritance.Position;

public abstract class GeometricFigure extends Figure {
    private String tag;
    private String description;
    private String type;
    private double area;

    public  GeometricFigure(final int color) {
        super(color);
    }

    public GeometricFigure(final String type) {
        super(1);
        this.type = type;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    public final String getDescription() {
        return description;
    }

    public final void setType(final String type) {
        this.type = type;
    }

    public final String getType() {
        return type;
    }

    /**
     * Castle movement We are supposing an empty board
     */
    public boolean move(final Position origin, final Position destination) {
        return true;
    }

    public final void printDescription() {
        System.out.println("Tag : " + tag + "\n" + "Figure type : " + type + "\n" + "Area : " + area);
    }

    /**
     * @return string tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @return double area
     */
    public double getArea() {
        return area;
    }

    public abstract double area();
}

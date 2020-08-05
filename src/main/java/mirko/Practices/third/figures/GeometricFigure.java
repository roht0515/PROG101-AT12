package figures;

import java.io.BufferedReader;
import java.io.IOException;

public class GeometricFigure extends Figure {
    private String tag;
    private String type;
    private double area;

    public final void setTag(final String description) {
        this.tag = description;
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setFigureType(final String type) {
        this.type = type;
    }

    /**
    @return Strign type;
    **/
    public String getFigureType() {
        return this.type;
    }

    public final void setArea(final int area) {
        this.area = area;
    }
    /**
    @return duble area;
    **/
    public double area() {
        return this.area;
    }

    public void drawTxt() {
    }

    public void readFigureData(final BufferedReader reader) throws IOException {
    }

    public final void printDescription() {
        System.out.println("Tag: " + this.tag);
        System.out.println("Figure Type: " + this.type);
        System.out.println("Area: " + this.area);
    }
}

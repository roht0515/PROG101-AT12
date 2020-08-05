package julia.practices.third.figures;

public class Rectangle extends GeometricFigure {
    private int base;
    private  int height;

    public Rectangle(final int base, final int height, final String tag) {
        super(tag);
        this.base = base;
        this.height = height;
    }

    /**
     *
     * @return int base
    */
    public int getBase() {
        return base;
    }
    /**
     *
     * @param
    */

    public void setBase(final int base) {
        this.base = base;
    }

    /**
     *
     * @return int height
    */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @parame
    */
    public void setHeight(final int height) {
        this.height = height;
    }

    /**
     *
     * @return string figureType
    */
    public String getFigureType() {
        return "Rectangle";
    }

    /**
     *
     * @return double area
    */
    public double area() {
        return getBase() * getHeight();
    }

    /**
     * @param
    */
    public void drawTxt() {
        System.out.println("******\n"
        + "******\n"
        + "******");

    }
}

package rodrigo.practices.third;
    public class Rectangle extends GeometricFigure {
    private int base;
    private int height;

    public Rectangle(int base, int height, String tag) {
        super(tag);
        this.base = base;
        this.height = height;
    }

    /**
     *
     * @return base
     */
    public int getBase() {
        return base;
    }

    /**
     *
     * @return set base
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     *
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return set height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     *
     * @return figure type
     */
    public String getFigureType() {
        return "Rectangle";
    }

    /**
     *
     * @return area
     */
    public double area() {
        return getBase() * getHeight();
    }

    /**
     *
     * @return print figure
     */
    public String drawTxt() {
        String draw = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                draw += "*";
            }
            draw += "\n";
        }
        return draw;
    }
}

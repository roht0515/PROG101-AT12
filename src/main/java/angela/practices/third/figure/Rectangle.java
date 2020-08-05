package angela.practices.third.figure;

public class Rectangle extends GeometricFigure {
    private int sideA, sideB;

    public Rectangle(final int color) {
        super(color);
        sideA = 0;
        sideB = 0;
        this.setType("Rectangle");
    }

    public Rectangle(final int sideA, final int sideB) {
        super(1);
        this.sideA = sideA;
        this.sideB = sideB;
        this.setType("Rectangle");
    }

    /**
     * @param side
     */
    public void setSideA(final int side) {
        sideA = side;
    }

    /**
     * @param side
     */
    public void setSideB(final int side) {
        sideB = side;
    }

    /**
     * @return  the type of a figure
     */
    public String getFigureType() {
        return getType();
    }

    /**
     *
     * @param type
     */
    public void setFigureType(final String type) {
        setType(type);
    }

    /**
     *
     * @return area
     */
    public double area() {
        return sideA * sideB;
    }

    /**
     *
     * @return a sideA of rectangle
     */
    public int getSideA() {
        return sideA;
    }

    /**
     *
     * @return a sideB of rectangle
     */
    public int getSideB() {
        return sideB;
    }

    /**
     *
     * draw a rectangle in the console
     */
    public void drawTxt() {
        String result = "";
        for (int i = 0; i < sideA; i++) {
            for (int j = 0; j < sideB; j++) {
                result += "* ";
            }
            System.out.println(result);
            result = "";
        }
    }
}

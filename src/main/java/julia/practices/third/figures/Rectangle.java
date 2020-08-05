package julia.practices.third.figures;
public class Rectangle extends GeometricFigure {
    private int base;
    private int height;

    public Rectangle(final int base, final int height, final String tag) {
        super(tag);
        this.base = base;
        this.height = height;
    }

    public Rectangle(final int side, final String tag) {
        super(tag);
        this.base = side;
        this.height = side;
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
        return base * height;
    }

    /**
     * @param
    */
    public void drawTxt() {
        for (int h = 0; h < height; h++) {
            for (int b = 0; b < base; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

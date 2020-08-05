package julia.practices.third.figures;

public class Square extends Rectangle {
    public Square(final int base, final int height, final String tag) {
        super(base, height, tag);
    }

    /**
     *
     * @return figure type
     */
    public String getFigureType() {
        return "Square";
    }

    /**
     *
     * @return double area
     */
    public double area() {
        return super.getBase() * super.getBase();
    }

    /**
     *
     * @param
     */
    public void drawTxt() {
        System.out.println("***\n"
                           + "***\n"
                           + "***");
    }
}

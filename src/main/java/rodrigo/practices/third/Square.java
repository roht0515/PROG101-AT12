package rodrigo.practices.third;
public class Square extends Rectangle {
    public Square(int base, int height, String tag) {
        super(base, height, tag);
    }

    /**
     *
     * @return figure
     */
    public String getFigureType() {
        return "Square";
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
     * @return draw figure
     */
    public String drawTxt() {
        String draw = "";
        for (int i = 0; i < super.getHeight(); i++) {
            for (int j = 0; j < super.getBase(); j++) {
                draw += "*";
            }
            draw += "\n";
        }
        return draw;
    }
}

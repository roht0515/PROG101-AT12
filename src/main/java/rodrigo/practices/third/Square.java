public class Square extends Rectangle {
    public Square(int base, int height, String tag) {
        super(base, height, tag);
    }

    public String getFigureType() {
        return "Square";
    }

    public double area() {
        return getBase() * getHeight();
    }

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

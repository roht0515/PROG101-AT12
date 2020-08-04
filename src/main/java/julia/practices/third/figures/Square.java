package julia.practices.third.figures;

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
    public void drawTxt() {
        System.out.println("***\n" +
                           "***\n" +
                           "***");
    }
}

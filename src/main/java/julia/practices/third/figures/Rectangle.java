package julia.practices.third.figures;

public class Rectangle extends GeometricFigure {
    private int base;
    private  int height;

    public Rectangle(int base, int height, String tag) {
        super(tag);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFigureType() {
        return "Rectangle";
    }

    public double area() {
        return getBase() * getHeight();
    }

    public void drawTxt() {
        System.out.println( "******\n"+
                            "******\n"+
                            "******");

    }
}

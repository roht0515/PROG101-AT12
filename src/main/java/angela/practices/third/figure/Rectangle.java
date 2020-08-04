package angela.practices.third.figure;

public class Rectangle extends GeometricFigure {
    private int sideA, sideB;
    //private String type;
    public Rectangle(int color) {
        super(color);
        sideA = 0;
        sideB = 0;
    }

    public Rectangle(int sideA, int sideB) {
        super(1);
        this.sideA = sideA;
        this.sideB = sideB;
        if(sideA == sideB) {
            this.type = "Square";
        } else {
            this.type = "Rectangle";
        }
    }
    public void setSideA(int side) {
        sideA = side;
    }
    public void setSideB(int side) {
        sideB = side;
    }
    public String getFigureType(){
        return type;
    }

    public double area(){
        return super.getArea();
    }
    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public void drawTxt(){
        String result = "";
        for(int i = 0; i < sideA; i++) {
            for (int j = 0; j < sideB; j++){
                result += "* ";
            }
            System.out.println(result);
            result = "";
        }
    }
}

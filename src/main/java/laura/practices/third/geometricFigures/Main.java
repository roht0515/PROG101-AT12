package laura.practices.third.geometricFigures;

public class Main {

    public static void main(final String args[]) {
        GeometricFigure gFigure = new GeometricFigure(0, "r-5");
        GeometricFigure gFigure1 = new GeometricFigure(0, "s-5");
        Rectangle rectangle = new Rectangle(0, 2, 3);
        gFigure.printDescription(rectangle);
        rectangle.drawTxt();
        Square square = new Square(1, 2, 2);
        gFigure1.printDescription(square);
        square.drawTxt();
    }
}
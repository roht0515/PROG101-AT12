package laura.practices.third.geometricFigures;

public class Main {

    public static void main(final String args[]) {
        Rectangle rectangle = new Rectangle("r-5", 2, 3);
        Square square = new Square("s-5", 2);
        rectangle.printDescription(rectangle);
        rectangle.drawTxt();
        System.out.println("Another figure");
        square.printDescription(square);
        System.out.println("");
        square.drawTxt();
    }
}
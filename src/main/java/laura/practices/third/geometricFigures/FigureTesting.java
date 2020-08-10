package laura.practices.third.geometricFigures;

public interface FigureTesting {

    int RECTANGLE = 1;
    int SQUARE = 2;

    void printMenu();
    void printFigure();

    static void main(final String[] args) {
        Rectangle rectangle = new Rectangle("r-1", 2, 1);
        rectangle.printMenu();
    }
}

package laura.practices.third.geometricFigures;

import java.util.Scanner;

public class Rectangle extends GeometricFigure implements FigureTesting {

    private static final String LABEL = "Rectangle";
    private int height;
    private int width;
    private int actualHeight = 0;
    private int actualWidth = 0;
    private int lastHeight;
    private int lastWidth;

    public Rectangle(final String tag, final int height, final int width) {
        super(tag);
        this.label = LABEL;
        this.height = height;
        this.width = width;
        this.area = height * width;
    }

    /**
     * @return int height
     */
    public int getHeight() {
        return height;
    }
    /**
     * @return int width
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     */
    public void drawTxt() {
        String cad = "";
        for (int a = 0; a < height; a++) {
            for (int i = 0; i < width; i++) {
                cad += "*";
            }
            cad = cad + "\n";
        }
        System.out.print(cad);
    }
    /**
     * Method to print menu
     */
    @Override
    public void printMenu() {
        Scanner inKeyboard = new Scanner(System.in);
        int num = 0, side;
        do {
            System.out.println("1.-Create rectangle");
            System.out.println("2.-Create square");
            System.out.println("3.-Display figure");
            System.out.println("0.-Exit");
            System.out.println("Select one of the options displayed");
            num = inKeyboard.nextInt();

            switch (num) {

                case 1:
                    System.out.println("Rectangle");
                    System.out.println("Type the width of rectangle: ");
                    this.width = inKeyboard.nextInt();
                    System.out.println("Type the height of rectangle: ");
                    this.height = inKeyboard.nextInt();
                    actualWidth = width;
                    actualHeight  = height;
                    drawTxt();
                    break;
                case 2:
                    System.out.println("Square");
                    System.out.println("Type the side of square: ");
                    side = inKeyboard.nextInt();
                    this.width = side;
                    this.height = side;
                    actualHeight = side;
                    actualWidth = side;
                    drawTxt();
                    break;
                case 3:
                    printFigure();
                    break;
                default:
                    break;
            }
            lastHeight = actualHeight;
            lastWidth = actualWidth;
        } while (num != 0);
    }
    /**
     * Method to print figure
     */
    @Override
    public void printFigure() {
        System.out.println("Last figure");
        this.height = lastHeight;
        this.width = lastWidth;
        drawTxt();
    }
}

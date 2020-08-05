package julia.practices.third.figures;

import java.util.Scanner;

public class FiguresTesting {
    public static final int OPTION_THREE = 3;
    public static final int OPTION_TWO = 2;
    public static final int OPTION_ONE = 1;
    private String name;
    public FiguresTesting() {
        name = "main";
    }

    public static void main(final String[] arg) {
        GeometricFigure[] geometricFigure = new GeometricFigure[2];
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int previous = 0;
        int number = scanner.nextInt();
        while (number != 0) {
            if (number == OPTION_ONE) {
                geometricFigure[0] = createRectangle();
                previous = number;
            }
            if (number == OPTION_TWO) {
                geometricFigure[1] = createSquare();
                previous = number;
            }
            if (number == OPTION_THREE) {
                if (previous == OPTION_ONE) {
                    geometricFigure[0].drawTxt();
                    System.out.println(geometricFigure[0].printDescription());
                }
                if (previous == OPTION_TWO) {
                    geometricFigure[1].drawTxt();
                    System.out.println(geometricFigure[1].printDescription());
                }
            }
            showMenu();
            number = scanner.nextInt();

        }
            System.exit(0);
    }

    private static Rectangle createRectangle() {
        System.out.println("enter base for rectangle: ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.println("insert height for rectangle: ");
        int height = scanner.nextInt();
        return new Rectangle(base, height, "R-1");
    }
    private static  Square createSquare() {
        System.out.println("insert side for square: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return  new Square(num, "C-1");
    }

    private static void showMenu() {
        System.out.println("1.- Create rectangle\n"
                + "2.- Create square\n"
                + "3.- Display figure\n"
                + "0.- Exit");
    }
}

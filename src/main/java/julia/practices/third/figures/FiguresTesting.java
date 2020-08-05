package julia.practices.third.figures;

import java.util.Scanner;

public class FiguresTesting {
    public static final int NUMBER_THREE = 3;
    private String name;
    public FiguresTesting() {
        name = "main";
    }

    public static void main(final String[] arg) {
        GeometricFigure geometricFigure;
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0) {
            if (number == 1) {
                geometricFigure = createRectangle();
                showMenu();
                int number3 = scanner.nextInt();
                if (number3 == NUMBER_THREE) {
                    geometricFigure.drawTxt();
                    System.out.println(geometricFigure.printDescription());
                }
            }
            if (number == 2) {
                geometricFigure = createSquare();
                showMenu();
                int number3 = scanner.nextInt();
                if (number3 == NUMBER_THREE) {
                    geometricFigure.drawTxt();
                    System.out.println(geometricFigure.printDescription());
                }
            }
            showMenu();
            number = scanner.nextInt();

        }
            System.exit(0);
    }

    private static Rectangle createRectangle() {
        System.out.println("enter the base: ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.println("enter the height: ");
        int height = scanner.nextInt();
        return new Rectangle(base, height, "R-1");
    }
    private static  Square createSquare() {
        System.out.println("enter the base: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return  new Square(num, num, "C-1");
    }

    private static void showMenu() {
        System.out.println("1.- Create rectangle\n"
                + "2.- Create square\n"
                + "3.- Display figure\n"
                + "0.- Exit");
    }
}

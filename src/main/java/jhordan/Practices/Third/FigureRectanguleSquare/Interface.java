package jhordan.Practices.Third.FigureRectanguleSquare;

import java.util.Scanner;

final class Interface {
    private static GeometricFigure figure;
    private static String number;
    static final int NUMBER_ZERO = 0;
    static final int NUMBER_ONE = 1;
    static final int NUMBER_TWO = 2;
    static final int NUMBER_THREE = 3;
    static final int NUMBER_FOUR = 4;
    private Interface() { }
    public static void main(final String[] arg) {
        menu();
        while (!insertvalues()) {
            System.out.println("insert a number of the list");
            menu();
        }
    }

    private static boolean insertvalues() {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        number = scanner.next();
        if (isNumber(number)) {
            if (isInRange(number)) {
                int num = Integer.parseInt(number);
                while (num != NUMBER_ZERO) {
                    if (num == NUMBER_ONE) {
                        figure = createRectangle();
                        num = NUMBER_FOUR;
                    }
                    if (num == NUMBER_TWO) {
                        figure = createSquare();
                        num = NUMBER_FOUR;
                    }
                    if (num == NUMBER_THREE) {
                        figure.drawTxt();
                        figure.printDescription();
                        num = NUMBER_FOUR;
                    }
                    if (num == NUMBER_FOUR) {
                        menu();
                        number = scanner.next();
                        try {
                            num = Integer.parseInt(number);
                        } catch (NumberFormatException e) {
                        result = false;
                        }
                    }
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    private static Rectangule createRectangle() {
        System.out.println("enter base for rectangle: ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.println("insert height for rectangle: ");
        int height = scanner.nextInt();
        System.out.println("insert tag for rectangle: ");
        String tag = scanner.next();
        return new Rectangule(tag, base, height);
    }

    private static  Square createSquare() {
        System.out.println("insert side for square: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("insert tag for square: ");
        String tag = scanner.next();
        return  new Square(tag, num);
    }

    private static boolean isInRange(final String number) {
        if (number.equals("0") || number.equals("1") || number.equals("2") || number.equals("3")) {
            return true;
        }
        return false;
    }

    public static boolean isNumber(final String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return  false;
        }
    }

    public static void menu() {
        System.out.println("1.- Create rectangle\n"
                + "2.- Create square\n"
                + "3.- Display figure\n"
                + "0.- Exit");
    }
}

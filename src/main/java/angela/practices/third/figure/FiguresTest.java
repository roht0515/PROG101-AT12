package angela.practices.third.figure;

import angela.practices.third.inheritance.Figure;
import java.util.Scanner;

public class FiguresTest {
    private Scanner scanner;
    private int response = -1;
    private Figure figure;
    private static final int OPTION_1 = 1;
    private static final int OPTION_2 = 2;
    private static final int OPTION_3 = 3;
    private static final int OPTION_0 = 0;
    public FiguresTest() {
        scanner = new Scanner(System.in);
        //figure = new Rectangle(1);
    }

    public static void main(final String[] args) {
        Rectangle rectangle = new Rectangle(2, 1);
        rectangle.printDescription();
        FiguresTest figures = new FiguresTest();
        figures.start();
    }

    /**
     *
     * start the console menu
     */
    public void start() {
        int sideA = 0;
        int sideB = 0;
        do {
            response = prompt("select option:\n1.- Create rectangle \n2.- Create square\n3.- Display figure\n0.- exit\n");
            if (response == OPTION_1) {
                System.out.println("side A");
                sideA = (int) scanner.nextInt();
                System.out.println("side B");
                sideB = (int) scanner.nextInt();
                figure = new Rectangle(sideA, sideB);
                System.out.println(((Rectangle) figure).getFigureType());
                ((Rectangle) figure).drawTxt();
            }
            if (response == OPTION_2) {
                System.out.println("side");
                sideA = (int) scanner.nextInt();
                figure = new Square(sideA);
                System.out.println(((Square) figure).getFigureType());
                ((Square) figure).drawTxt();
            }
            if (response == OPTION_3) {
                if (figure instanceof Rectangle) {
                    System.out.println(((Rectangle) figure).getFigureType());
                    ((Rectangle) figure).drawTxt();

                } else if (figure instanceof Square) {
                    System.out.println(((Square) figure).getFigureType());
                    ((Square) figure).drawTxt();
                } else  {
                    System.out.println("First create a figure\n");
                }
            }
        } while (response != OPTION_0);
        System.out.println(
                "\ngoodbay");
    }
    private int prompt(final String selection) {
        String input;
        int response = -1;
        System.out.print(selection);
        input = scanner.next();
        if (input.equals("1")) {
            response = OPTION_1;
        }
        if (input.equals("2")) {
            response = OPTION_2;
        }
        if (input.equals("3")) {
            response = OPTION_3;
        }
        if (input.equals("0")) {
            response = OPTION_0;
        }
        return response;
    }
}

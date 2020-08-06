package angela.practices.third.figure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FiguresTest {
    private Scanner scanner;
    private int response = -1;
    private GeometricFigure figure = null;
    private static final int OPTION_1 = 1;
    private static final int OPTION_2 = 2;
    private static final int OPTION_3 = 3;
    private static final int OPTION_4 = 4;
    private static final int OPTION_0 = 0;
    private BufferedReader reader;

    public FiguresTest() {
        scanner = new Scanner(System.in);
    }

    public static void main(final String[] args) {
        FiguresTest figures = new FiguresTest();
        figures.start();
    }

    /**
     *
     * start the console menu
     */
    public void start() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            response = prompt("select option:\n1.- Create rectangle\n2.- Create square\n3.- Display figure\n4.- Display details\n0.- exit\n");
            if (response == OPTION_1) {
                figure = Rectangle.readFigureData(reader);
            }
            if (response == OPTION_2) {
                figure = Square.readFigureData(reader);
            }
            if (response == OPTION_3) {
                if (figure != null) {
                    figure.drawTxt();
                } else {
                    System.out.println("First create a figure\n");
                }
            }
            if (response == OPTION_4) {
                if (figure != null) {
                    figure.printDescription();
                } else {
                    System.out.println("First create a figure\n");
                }
            }
        } while (response != OPTION_0);
        System.out.println(
                "\nGoodbye");
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
        if (input.equals("4")) {
            response = OPTION_4;
        }
        if (input.equals("0")) {
            response = OPTION_0;
        }
        return response;
    }
}

package angela.practices.third.figure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiguresTest {
    private int response = -1;
    private Figure figure = null;
    private static final int OPTION_1 = 1;
    private static final int OPTION_2 = 2;
    private static final int OPTION_3 = 3;
    private static final int OPTION_4 = 4;
    private static final int OPTION_0 = 0;
    private BufferedReader reader;

    public FiguresTest() {
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
            switch (response) {
                case OPTION_1:
                    figure = Rectangle.readFigureData(reader);
                case OPTION_2:
                    figure = Square.readFigureData(reader);
                case OPTION_3:
                    if (figure != null) {
                        figure.drawTxt();
                    } else {
                        System.out.println("First create a figure\n");
                    }
                case OPTION_4:
                    if (figure != null) {
                        figure.printDescription();
                    } else {
                        System.out.println("First create a figure\n");
                    }
                default:
                    System.out.println("Enter a valid value");
            }
        } while (response != OPTION_0);
        System.out.println("\nGoodbye");
    }
    private int prompt(final String selection) {
        int input = -1;
        System.out.print(selection);
        try {
            input = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Invalid value: " + e.getMessage());
        }
        return input;
    }
}

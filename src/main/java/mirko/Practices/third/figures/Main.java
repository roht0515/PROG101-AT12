package figures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static final int NUMBER_ZERO = 0;
    static final int NUMBER_ONE = 1;
    static final int NUMBER_TWO = 2;
    static final int NUMBER_THREE = 3;
    private String name;
    
    public Main() throws IOException {
        name = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean controller = true;
        String input;
        int number;
        GeometricFigure figure = new GeometricFigure();
        while (controller) {
            System.out.println("1.- Create rectangle");
            System.out.println("2.- Create square");
            System.out.println("3.- Display figure");
            System.out.println("0.- Exit");
            input = reader.readLine();
            number = Integer.parseInt(input);
            switch (number) {
                case NUMBER_ZERO:
                    controller = false;
                    break;
                case NUMBER_ONE:
                    figure = new Rectangle(1, 1);
                    System.out.println("Enter two numbers separated with a space:");
                    figure.readFigureData(reader);
                    break;
                case NUMBER_TWO:
                    figure = new Square(1);
                    System.out.println("Enter a number in next line:");
                    figure.readFigureData(reader);
                    break;
                case NUMBER_THREE:
                    if ((figure instanceof Rectangle) || (figure instanceof Square)) {
                        figure.printDescription();
                        figure.drawTxt();
                    } else {
                        System.out.println("Not figure created");
                    }
                    break;
                        default:
                    break;
            }
        }
    }
}

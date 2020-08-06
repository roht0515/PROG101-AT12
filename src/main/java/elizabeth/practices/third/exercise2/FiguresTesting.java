package elizabeth.practices.third.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class FiguresTesting {

    private FiguresTesting() {
        throw new IllegalStateException("Utility class");
    }
    public  static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.-Create rectangle"
                         + "\n2.-Create square"
                         + "\n3.-Display figure"
                         + "\n0.-Exit");

        String option = "0";
        Figure figure = null;

        do {
            option = reader.readLine();

            switch (option) {
                case "1":
                    System.out.println("Enter height: ");
                    int height = Integer.parseInt(reader.readLine());
                    System.out.println("Enter width: ");
                    int width = Integer.parseInt(reader.readLine());

                    figure = new Rectangle("R-1", "Rectangle", height, width);
                    System.out.println("A rectangle was created");
                    break;
                case "2":
                    System.out.println("Enter side: ");
                    int side = Integer.parseInt(reader.readLine());
                    figure = new Square("S-1", "Square", side);
                    System.out.println("A square was created");
                    break;
                case "3":
                    if (figure != null) {
                        figure.drawTxt();
                        figure.printDescription();
                    } else {
                        System.out.println("Must create a rectangle or square before this option.");
                    }
                    break;
                case "0":
                    continue;
                default:
                    System.out.println("The option Valid are 1, 2, 3, 0");
                    break;
            }
        } while (!option.equals("0"));
    }
}

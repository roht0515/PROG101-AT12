package samuel.practices.third.b;

import java.util.Scanner;

public class Menu {

    private Rectangle rectangle;
    private Square square;
    private Scanner sc;
    private static final int OPTION_ONE = 1;
    private static final int OPTION_TWO = 2;
    private static final int OPTION_THREE = 3;

    public Menu() {
        sc = new Scanner(System.in);
    }
    /**
     * This method call displayMenu and setOption
     */
    public void init() {
        displayMenu();
        setOption();
    }
    /**
     * Display the menu option
     */
    public void displayMenu() {
        System.out.println("1.- Create rectangle");
        System.out.println("2.- Create square");
        System.out.println("3.- Display figure");
        System.out.println("0.- Exit");
    }
    /**
     * This method read input
     */
    public void setOption() {
        int option = sc.nextInt();
        while (option != 0) {
            switch (option) {
                case OPTION_ONE:
                    optionRectangle();
                  break;
                case OPTION_TWO:
                    optionSquare();
                  break;
                case OPTION_THREE:
                    optionDisplayFigure();
                  break;
                default:
                    invalidOption();
            }
            displayMenu();
            option = sc.nextInt();
        }
    }
    /**
     * This method read input for base and height of the rectangle
     */
    public void optionRectangle() {
        rectangle = new Rectangle();
        System.out.println("Please enter the base of the rectangle");
        rectangle.setBase(sc.nextInt());
        System.out.println("Please enter the height of the rectangle");
        rectangle.setHeight(sc.nextInt());
        rectangle.setArea(rectangle.area());
    }
    /**
     * This method read input for side of the square
     */
    public void optionSquare() {
        System.out.println("Please enter the side of the square");
        square = new Square(sc.nextInt());
        square.setArea(square.area());
    }
    /**
     * This method draw the figure
     */
    public void optionDisplayFigure() {

        if (square != null)  {
            square.drawTxt();
        }

        if (rectangle != null)  {
            rectangle.drawTxt();
        }

        square = null;
        rectangle = null;
    }
    /**
     * This method show message invalid input
     */
    public void invalidOption() {
        System.out.println("Please select numbers from 0 to 3");
    }
}

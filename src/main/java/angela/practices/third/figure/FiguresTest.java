package angela.practices.third.figure;

import java.util.*;

public class FiguresTest {
    Scanner scanner;
    int response = -1;
    Rectangle rectangle;
    public FiguresTest(){
        scanner = new Scanner(System.in);
        rectangle = new Rectangle(1);
    }

    public static void main(String[] args) {
        FiguresTest figures = new FiguresTest();
        figures.start();
    }

    public void start( ) {
        int sideA = 0;
        int sideB = 0;
        do {
            response = prompt("select option:\n1.- Create rectangle \n2.- Create square\n3.- Display figure\n0.- exit\n");
            if (response == 1) {
                System.out.println("side A");
                sideA = (int)scanner.nextInt();
                System.out.println("side B");
                sideB = (int)scanner.nextInt();
                rectangle = new Rectangle(sideA, sideB);
                System.out.println(rectangle.getFigureType());
                rectangle.drawTxt();
            }
            if (response == 2) {
                System.out.println("side");
                sideA = (int)scanner.nextInt();
                rectangle = new Rectangle(sideA, sideA);
                System.out.println(rectangle.getFigureType());
                rectangle.drawTxt();
            }
            if (response == 3) {
                if (rectangle.getSideA() == 0) {
                    System.out.println("First create a figure\n");
                } else {
                    System.out.println(rectangle.getFigureType());
                    rectangle.drawTxt();
                }
            }
        } while (response != 0);
        System.out.println(
                "\ngoodbay");
    }
    private int prompt(String question) {
        String input;
        int response = -1;
        System.out.print(question);
        input = scanner.next();
        if (input.equals("1")) {
            response = 1;
        }
        if (input.equals("2")) {
            response = 2;
        }
        if (input.equals("3")) {
            response = 3;
        }
        if (input.equals("0")) {
            response = 0;
        }
        return response;
    }
}

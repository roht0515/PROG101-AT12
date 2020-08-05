package elizabeth.practices.third.exercise2;

import elizabeth.practices.third.exercise1.Figure;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiguresTesting {
    public  static void main(String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("1.-Create rectangle");
        System.out.println("2.-Create square");
        System.out.println("3.-Display figure");
        System.out.println("0.-Exit");

        String option = "0";
        GeometricFigure figure = null;

        do {
            option = reader.readLine();

            switch (option){
                case "1":
                    System.out.println("Enter height: ");
                    int height = Integer.parseInt(reader.readLine());
                    System.out.println("Enter width: ");
                    int width = Integer.parseInt(reader.readLine());

                    figure = new Rectangle("rectangle",height, width);
                    System.out.println("A rectangle was created");
                    break;
                case "2":
                    System.out.println("Enter side: ");
                    int side = Integer.parseInt(reader.readLine());
                    figure = new Square("square",side);
                    System.out.println("A square was created");
                    break;
                case "3":
                    if(figure != null)
                        figure.drawTxt();
                    else
                        System.out.println("Must create a rectangle or square before this option.");
                    break;
                case "0":
                    continue;
                default:
                    System.out.println("");
                    break;
            }
        }while (!option.equals("0"));
    }
}

import java.util.ArrayList;
import java.util.Scanner;
public class FiguresTesting {
    public static ArrayList<GeometricFigure> geometricFigures;
    public static void main(String[] arg) {
        geometricFigures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            menu();
            int number = scanner.nextInt();
            switch (number)
            {
                case 1: {
                    geometricFigures.add(createRectangle());
                } break;
                case 2: {
                    geometricFigures.add(createSquare());
                } break;
                case 3: {
                    int size = geometricFigures.size();
                    int cont = 0;
                    if(size == 0) {
                        System.out.println("No hay figuras por mostrar");
                    } else {
                        for(GeometricFigure figure :geometricFigures) {
                            cont++;
                            if(cont == size) {
                                System.out.println(figure.printDescription());
                                System.out.println(figure.drawTxt());
                            }
                        }
                    }
                } break;
                case 0: {
                    flag = false;
                } break;
                default: {
                    System.out.println("Error, opcion incorrecta, intente nuevamente");
                } break;
            }
        }while (flag);
        System.exit(0);
    }

    public static void menu() {
        System.out.println("1.- Create rectangle\n" +
                "2.- Create square\n" +
                "3.- Display figure\n" +
                "0.- Exit");
    }

    public static Rectangle createRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, enter the base");
        int base = scanner.nextInt();
        System.out.println("please, enter the height");
        int height = scanner.nextInt();
        return new Rectangle(base, height, "R-1");
    }

    public static Square createSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, enter the height");
        int height = scanner.nextInt();
        return new Square(height, height, "C-1");
    }
}

package elizabeth.practices.third.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Figure> figures = new ArrayList<Figure>();
        figures.add(new Castle(1));
        figures.add(new Castle(1));
        figures.add(new Castle(0));
        figures.add(new Castle(0));
        figures.add(new Queen(1));
        figures.add(new Queen(0));
        for (Figure figure: figures) {
            if (figure instanceof Castle) {
                ((Castle) figure).castle();
            }
            figure.whoAmI();
        }
    }
}

package jhordan.Practices.Third.FigureInheritanceCastleQueen;

import java.util.ArrayList;

public class FigureList {

    private static ArrayList<Figure> figures = new ArrayList<Figure>();
    public  FigureList() {
        figures = new ArrayList<>();
    }

    /**Returns an String with the quantity of queens And castles**/
    public String getQuantityQueensAndCastle(final ArrayList<Figure> figures) {
        int queen = 0, castle = 0;
        for (Figure figure: figures) {
            if (figure instanceof Queen) {
                queen++;
            } else {
                castle++;
            }
        }
        return "Quantity of castles: " + castle + " Quantity of queens: " + queen;
    }

    public static void main(final String[] args) {

        figures.add(new Queen(1));
        figures.add(new Queen(1));
        figures.add(new Queen(0));
        figures.add(new Queen(0));
        figures.add(new Queen(0));
        figures.add(new Queen(0));
        messageWhoAmI(figures);
    }

    public static void messageWhoAmI(final ArrayList<Figure> figures) {
        for (Figure figure : figures) {
          figure.whoAmI();
        }
    }

}

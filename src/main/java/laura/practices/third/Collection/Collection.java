package laura.practices.third.collection;

import java.util.ArrayList;

public class Collection {

    private ArrayList<Figure> figureArray;
    private static final int CANT_QUEEN = 2;
    private static final int CANT_CASTLE = 4;

    public Collection() {
        figureArray = new ArrayList<>();
    }
    /**
     * @return ArrayList<Figure> figureArray
     */
    public ArrayList<Figure> getFigureArray() {
        return figureArray;
    }
    /**
     * Method to addFigure
     */
    public void addFigure() {
        Castle castle = new Castle(0);
        Queen queen = new Queen(1);
        int counterQueen = 0;
        int counterCastle = 0;
        while (counterQueen < CANT_QUEEN) {
            figureArray.add(queen);
            counterQueen++;
        }
        while (counterCastle < CANT_CASTLE) {
            figureArray.add(castle);
            counterCastle++;
        }
    }
}

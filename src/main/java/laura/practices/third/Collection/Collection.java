package laura.practices.third.Collection;

import java.util.ArrayList;

public class Collection {

    public ArrayList<Figure> figureArray;
    private static final int CANT_QUEEN = 2;
    private static final int CANT_CASTLE = 4;

    public Collection() {
        figureArray = new ArrayList<>();
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

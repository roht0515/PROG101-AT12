package julia.practices.third.inheritance;

import java.util.ArrayList;

public class Collection {
    private  ArrayList<Figure> figures;
    private static final int CANT_QUEEN = 2;
    private static final int CANT_CASTLE = 4;
    private static final int SIZE_FIGURE = 6;

    public  Collection() {
        figures = new ArrayList<>();
    }

    /*
     *
     * @param
     */
    public final void addFigure(final Figure figure) {
        if (figures.size() < SIZE_FIGURE) {
            if (figure instanceof Queen) {
                if (getCantQueens() < CANT_QUEEN) {
                    figures.add(figure);
                }
            } else if (figure instanceof Castle) {
                if (getCantCastles() < CANT_CASTLE) {
                    figures.add(figure);
                }
            }
        }
    }

    private int getCantQueens() {
        int queens = 0;
        for (Figure figure: figures) {
            if (figure instanceof Queen) {
                queens++;
            }
        }
        return queens;
    }

    private int getCantCastles() {
        int castle = 0;
        for (Figure figure: figures) {
            if (figure instanceof Castle) {
                castle++;
            }
        }
        return castle;
    }

    /*
     *
     * @param
     */
    public final void travelCollection() {
        for (Figure figure : figures) {
            figure.whoAmI();
        }
    }

    public static void main(final String[] args) {
        Figure queen = new Queen(1);
        Figure queen2 = new Queen(0);
        Figure castle = new Castle(1);
        Figure castle2 = new Castle(1);
        Figure castle3 = new Castle(0);
        Figure castle4 = new Castle(0);
        Collection collection = new Collection();
        collection.addFigure(queen);
        collection.addFigure(queen2);
        collection.addFigure(castle);
        collection.addFigure(castle2);
        collection.addFigure(castle3);
        collection.addFigure(castle4);
        collection.travelCollection();
    }

    /*
     *
     * @return arraylist
     */
    public final ArrayList<Figure> getFigures() {
        return figures;
    }
}

package rodrigo.practices.third;
import java.util.ArrayList;
public class FiguresCollection {
    private  ArrayList<Figure> figures;

    public  FiguresCollection() {
        figures = new ArrayList<>();
    }

    public void addFigure (Figure figure) {
       figures.add(figure);
    }

    /**
     *
     * @return Total queens
     */
    public int getAmountOfQueens() {
        int totalQueens = 0;
        for (Figure figure: figures) {
            if ( figure instanceof Queen) {
                totalQueens ++;
            }
        }
        return totalQueens;
    }

    /**
     *
     * @return total castles
     */
    public int getAmountOfCastles() {
        int totalCastles = 0;
        for (Figure figure: figures) {
            if ( figure instanceof Castle) {
                totalCastles ++;
            }
        }
        return totalCastles;
    }

    /**
     *
     * @return total figures
     */
    public int getAmountOfFigures () {
        int cont = 0;
        for (Figure figure: figures) {
            cont++;
        }
        return cont;
    }

    /**
     *
     * @return list of figures
     */
    public String iterateFiguresCollection() {
        String listOfFigures = "";
        for (Figure figure: figures) {
            listOfFigures += figure.whoAmI() + "\n";
        }
        return listOfFigures;
    }
}

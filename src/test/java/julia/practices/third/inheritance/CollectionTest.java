package julia.practices.third.inheritance;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CollectionTest {

    private ArrayList<Figure> figures;
    @Test
    public void testAddTwoQueensFourCastles() {
        Collection collection = new Collection();
        Figure queen = new Queen(1);
        Figure queen2 = new Queen(0);
        Figure castle = new Castle(1);
        Figure castle2 = new Castle(1);
        Figure castle3 = new Castle(0);
        Figure castle4 = new Castle(0);
        collection.addFigure(queen);
        collection.addFigure(queen2);
        collection.addFigure(castle);
        collection.addFigure(castle2);
        collection.addFigure(castle3);
        collection.addFigure(castle4);
        figures = collection.getFigures();
        assertTrue(figures.size() == 6);
    }

    @Test
    public void testTravelWhoAmI() {
        Collection collection = new Collection();
        collection.travelCollection();
    }
}

import static org.junit.Assert.*;
import org.junit.Test;

public class FiguresCollectionTest {

    @Test
    public void testAddingTwoQueensAndFourCastles() {
        FiguresCollection figures = new FiguresCollection();
        Figure queenOne = new Queen(0);
        Figure queenTwo = new Queen(1);
        Figure castleOne = new Castle(0);
        Figure castleTwo = new Castle(0);
        Figure castleThree = new Castle(1);
        Figure castleFour = new Castle(1);
        figures.addFigure(queenOne);
        figures.addFigure(queenTwo);
        figures.addFigure(castleOne);
        figures.addFigure(castleTwo);
        figures.addFigure(castleThree);
        figures.addFigure(castleFour);
        int expected = 6;
        assertEquals(expected,figures.getAmountOfFigures());
    }

    @Test
    public void testAddingTwoQueens() {
        FiguresCollection figures = new FiguresCollection();
        Figure queenOne = new Queen(0);
        Figure queenTwo = new Queen(1);
        figures.addFigure(queenOne);
        figures.addFigure(queenTwo);
        int expected = 2;
        assertEquals(expected,figures.getAmountOfQueens());
    }

    @Test
    public void testAddingFourCastles() {
        FiguresCollection figures = new FiguresCollection();
        Figure castleOne = new Castle(0);
        Figure castleTwo = new Castle(0);
        Figure castleThree = new Castle(1);
        Figure castleFour = new Castle(1);
        figures.addFigure(castleOne);
        figures.addFigure(castleTwo);
        figures.addFigure(castleThree);
        figures.addFigure(castleFour);
        int expected = 4;
        assertEquals(expected,figures.getAmountOfCastles());
    }

    @Test
    public void testPrintFigures() {
        FiguresCollection figures = new FiguresCollection();
        Figure queenOne = new Queen(0);
        Figure queenTwo = new Queen(1);
        Figure castleOne = new Castle(0);
        Figure castleTwo = new Castle(0);
        Figure castleThree = new Castle(1);
        Figure castleFour = new Castle(1);
        figures.addFigure(queenOne);
        figures.addFigure(queenTwo);
        figures.addFigure(castleOne);
        figures.addFigure(castleTwo);
        figures.addFigure(castleThree);
        figures.addFigure(castleFour);
        String expected = "WHITE Queen"+ "\n";
        expected += "BLACK Queen"+ "\n";
        expected += "WHITE Castle"+ "\n";
        expected += "WHITE Castle"+ "\n";
        expected += "BLACK Castle"+ "\n";
        expected += "BLACK Castle"+ "\n";
        assertEquals(expected,figures.iterateFiguresCollection());
    }
}
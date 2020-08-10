package laura.practices.third.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class CollectionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    Queen queen = new Queen(0);
    Castle castle = new Castle(1);

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testMoveQueen() {
        Position origin = new Position(0, 0);
        Position destination = new Position(1, 1);
        Queen queen = new Queen(0);
        boolean expected = true;
        boolean actual = queen.move(origin, destination);
        assertEquals (expected, actual);
    }

    @Test
    public void testAddFiguresToCollection() {
        Collection collection = new Collection();
        collection.addFigure();
        for (Figure figure: collection.getFigureArray()) {
            figure.whoAmI();
        }
    }

    @Test
    public void testWhoAmIOfAQueen() { 
        queen.whoAmI();
        String expected = "WHITE\nQueen";
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testWhoAmIOfACastle() { 
        castle.whoAmI();
        String expected = "BLACK\nCastle";
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }
}
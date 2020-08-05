package julia.practices.third.figures;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SquareTest {

    @Test
    public void testGetTypeFigureReturnSubClassSquare() {
        Square square = new Square(4, "C-1");
        String expected = "Square";
        String actual = square.getFigureType();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTypeFigureNoReturnSubClassSquare() {
        Square square = new Square(4, "C-1");
        String expected = "";
        String actual = square.getFigureType();
        assertNotEquals(expected, actual);
    }

    @Test
    public void testGetAreaReturnSideXSideSubClassSquare() {
        Square square = new Square(4, "C-1");
        double  expected = 16;
        double actual = square.area();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testPrintDescriptionSinceSubClassSquare() {
        Square square = new Square(4,"C-1");
        String expected = "Tag: C-1"+"\n" +
                "Figure Type: Square" +"\n"+
                "Area: 16.0";
        String actual = square.printDescription();
        assertEquals(expected, actual);
    }
}

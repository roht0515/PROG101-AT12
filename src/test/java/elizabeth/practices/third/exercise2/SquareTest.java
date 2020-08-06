package elizabeth.practices.third.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SquareTest {
    @Test
    public void testAreaSquare() {
        Figure square = new Square("S-1", "Square", 3);
        square.drawTxt();
        double expected = 9.0;
        assertEquals(expected, square.area(), 0);
    }

    @Test
    public void testGetTag() {
        Figure square = new Square("S-1", "Square", 3);
        assertEquals("S-1", square.getTag());
    }

    @Test
    public void testGetFigureType() {
        Figure square = new Square("S-1", "Square", 3);
        assertEquals("Square", square.getFigureType());
    }
}

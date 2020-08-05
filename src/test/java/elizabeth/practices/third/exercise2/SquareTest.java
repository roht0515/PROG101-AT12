package elizabeth.practices.third.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;
public class SquareTest {
    @Test
    public void testAreaRectangle() {
        Square figure = new Square("square",4);
        figure.drawTxt();
        double expected = 16.0;
        assertEquals(expected, figure.area(),expected);
    }
    @Test
    public void testTypeRectangle() {
        Square square = new Square("square",4);
        square.drawTxt();
        String expected = "square";
        assertEquals(expected, square.getFigureType());
    }
}

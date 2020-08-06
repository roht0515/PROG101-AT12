package jhordan.Practices.Third.FiguresRectanguleSquare;

import jhordan.Practices.Third.FigureRectanguleSquare.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
     public void testGetArea() {
        Square square = new Square("c-5", 5);
        double expected = 25;
        double actual = square.area();
        assertEquals(expected, actual, 0); //delta helps in Rounding
    }

    @Test
    public void testTextDrawed() {
        Square square = new Square("c-5", 2);
        String expected = "**"+"\n"+"**"+"\n";
        String actual = square.textdrawed();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetType() {
        Square square = new Square("c-5", 2);
        String expected = "Square";
        String actual = square.getFigureType();
        assertEquals(expected,actual);
    }

}

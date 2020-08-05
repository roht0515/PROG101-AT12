package jhordan.Practices.Third.FiguresRectanguleSquare;

import jhordan.Practices.Third.FigureRectanguleSquare.Rectangule;
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
    public void testDrawTxt() {
        Square square = new Square("c-5", 2);
        String expected = "**"+"\n"+"**"+"\n";
        String actual = square.drawTxt();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetType() {
        Square square = new Square("c-5", 2);
        String expected = "square";
        String actual = square.getFigureType();
        assertEquals(expected,actual);
    }

    @Test
    public void testPrint() {
        Square square = new Square("c-5", 2);
        String expected = "Tag: c-5\n" +
                "Figure Type: square\n" +
                "Area: 4.0";
        String actual = square.printDescription();
        assertEquals(expected,actual);
    }
}

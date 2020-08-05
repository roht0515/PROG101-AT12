package jhordan.Practices.Third.FiguresRectanguleSquare;
import jhordan.Practices.Third.FigureRectanguleSquare.Rectangule;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RectanguleTest {
    @Test
    public void testGetArea() {
        Rectangule rectangule = new Rectangule("c-5",5,6);
        double expected = 30;
        double actual = rectangule.area();
        assertEquals(expected,actual,0); //delta helps in Rounding
    }

    @Test
    public void testDrawTxt() {
        Rectangule rectangule = new Rectangule("c-5",5,2);
        String expected = "*****"+ "\n" +"*****"+"\n";
        String actual = rectangule.drawTxt();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetType() {
        Rectangule rectangule = new Rectangule("c-5",5,2);
        String expected = "Rectangule";
        String actual = rectangule.getFigureType();
        assertEquals(expected,actual);
    }

    @Test
    public void testPrint() {
        Rectangule rectangule = new Rectangule("c-5",5,2);
        String expected = "Tag: c-5\n" +
                "Figure Type: Rectangule\n" +
                "Area: 10.0";
        String actual = rectangule.printDescription();
        assertEquals(expected,actual);
    }
}

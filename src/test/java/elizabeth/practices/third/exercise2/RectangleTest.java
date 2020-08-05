package elizabeth.practices.third.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testAreaRectangle() {
        Rectangle rect = new Rectangle("rectangle",3,6);
        rect.drawTxt();
        double expected = 18.0;
        assertEquals(expected, rect.area(),expected);
    }
    @Test
    public void testTypeRectangle() {
        Rectangle rect = new Rectangle("rectangle", 3,6);
        rect.drawTxt();
        String expected = "rectangle";
        assertEquals(expected, rect.getFigureType());
    }

}

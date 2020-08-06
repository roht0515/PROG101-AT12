package elizabeth.practices.third.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void testAreaRectangle() {
        Figure rect = new Rectangle("R-1", "Rectangle", 3, 6);
        rect.drawTxt();
        double expected = 18.0;
        assertEquals(expected, rect.area(), 0);
    }

    @Test
    public void testGetTag() {
        Figure rect = new Rectangle("R-1", "Rectangle", 3, 6);
        assertEquals("R-1", rect.getTag());
    }

    @Test
    public void testGetFigureType() {
        Figure rect = new Rectangle("R-1", "Rectangle", 3, 6);
        assertEquals("Rectangle", rect.getFigureType());
    }
}

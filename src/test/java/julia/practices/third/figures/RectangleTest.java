package julia.practices.third.figures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RectangleTest {
    @Test
    public void testGetTypeFigureReturnSubClassRectangle() {
        Rectangle rectangle = new Rectangle(4, 2,"R-2");
        String expected = "Rectangle";
        String actual = rectangle.getFigureType();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTypeFigureNoReturnSubClassRectangle() {
        Rectangle rectangle = new Rectangle(4, 3, "R-2");
        String expected = "";
        String actual = rectangle.getFigureType();
        assertNotEquals(expected, actual);
    }

    @Test
    public void testGetAreaReturnSideXSideSubClassRectangle() {
        Rectangle rectangle = new Rectangle(4, 5,"R-2");
        double  expected = 20;
        double actual = rectangle.area();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testPrintDescriptionSinceSubClassRectangle() {
        Rectangle rectangle = new Rectangle(4,3, "R-2");
        String expected = "Tag: R-2"+"\n" +
                "Figure Type: Rectangle" +"\n"+
                "Area: 12.0";
        String actual = rectangle.printDescription();
        assertEquals(expected, actual);
    }
}

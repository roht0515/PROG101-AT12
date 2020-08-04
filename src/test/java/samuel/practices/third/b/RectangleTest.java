package samuel.practices.third.b;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle();
        rectangle.setBase(6);
        rectangle.setHeight(3);
        String expected = 18.0 + "";
        String actual = rectangle.area() + "";
        assertEquals(expected, actual);
    }
}
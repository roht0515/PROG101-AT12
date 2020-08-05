package angela.practices.third;
import angela.practices.third.figure.Rectangle;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void getFigureType() {
        Rectangle rectangle = new Rectangle(1);
        String expected = "Rectangle";
        String actual = rectangle.getFigureType();
        assertEquals(expected, actual);
    }
    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(5, 4);
        double expected = 20.0;
        double actual = rectangle.area();
        assertEquals(expected, actual, 1);
    }
    @Test
    public void getFigureTypeWithConstructorWithTwoParameters() {
        Rectangle rectangle = new Rectangle(5, 5);
        String expected = "Rectangle";
        String actual = rectangle.getFigureType();
        assertEquals(expected, actual);
    }
}

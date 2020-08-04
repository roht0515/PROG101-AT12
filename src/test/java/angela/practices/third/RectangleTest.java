package angela.practices.third;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void drawTextWithSidesEquals() {
        Rectangle rectangle = new Rectangle(4,4);
        rectangle.drawTxt();
    }
    @Test
    public void getFigureType() {
        Rectangle rectangle = new Rectangle(1);
        String expected = "Rectangle";
        String actual = rectangle.getFigureType();
        assertEquals(expected, actual);
    }
}

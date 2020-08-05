package figures;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {
	@Test
    public void testCreateARectangleObjectWithZeroBaseAndZeroHeightAreaExpectedZeroAndPrintDescription(){
    	Rectangle rectangle = new Rectangle( 0, 0);
    	rectangle.setTag("R-1");
    	double actual = rectangle.area();
    	double expected = 0.0;
    	assertEquals(actual, expected, 0);
    	rectangle.printDescription();
    }

    @Test
    public void testCreateARectangleObjectWithSevenBaseAndThreeHeightAreaExpectedTwentyOneAndDrawTxt(){
    	Rectangle rectangle = new Rectangle(7, 3);
    	double actual = rectangle.area();
    	double expected = 21.0;
    	assertEquals(actual, expected, 0);
    	rectangle.drawTxt();
    }
}
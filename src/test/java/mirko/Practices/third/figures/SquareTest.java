package figures;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTest {
    
    @Test
    public void testCreateASquareObjectWithSideZeroExpectedAreaZeroAndPrintDescription(){
    	Square square = new Square(0);
    	square.setTag("S-1");
    	double actual = square.area();
    	double expected = 0.0;
    	assertEquals(actual, expected, 0);
    	square.printDescription();
    }

    @Test
    public void testCreateASquareObjectWithSideFiveAreaExpectedTwentyFiveAndDrawTxt(){
    	Square square = new Square(5);
    	double actual = square.area();
    	double expected = 25.0;
    	assertEquals(actual, expected, 0);
    	square.drawTxt();
    }
}
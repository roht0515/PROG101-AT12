package samuel.practices.third.b;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RectangleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    public void testAreaRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setBase(6);
        rectangle.setHeight(3);
        rectangle.setArea(rectangle.area());
        double expected = 18.0;
        double actual = rectangle.getArea();
        assertEquals(expected, actual, 0.01);
    }

   
    @Test
    public void testPrintDescription() {
        Rectangle rectangle = new Rectangle();
        rectangle.setBase(6);
        rectangle.setHeight(3);
        rectangle.setTag("C-5");
        rectangle.setArea(rectangle.area());
        rectangle.printDescription();
        String expected = outContent.toString();
        String actual = "Tag : C-5" + "\n";
              actual += "Figure Type : Rectangle" + "\n";
              actual += "Area : 18.0" + "\n";
        assertEquals(expected, actual);
    }

    @Test
    public void testDrawTxt() {
        Rectangle rectangle = new Rectangle();
        rectangle.setBase(6);
        rectangle.setHeight(3);
        rectangle.drawTxt();
        String expected = outContent.toString();
        String actual = "******" + "\n";
              actual += "******" + "\n";
              actual += "******" + "\n";
        assertEquals(expected, actual);
    }
}

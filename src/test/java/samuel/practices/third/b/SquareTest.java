package samuel.practices.third.b;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SquareTest {
    
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
    public void testAreaSquare() {
        Square square = new Square(5);
        square.setArea(square.area());
        double expected = 25;
        double actual = square.getArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testChangeAreaSquare() {
        Square square = new Square(5);
        square.setSide(10);
        square.setArea(square.area());
        double expected = 100;
        double actual = square.getArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testPrintDescription() {
        Square square = new Square(10);
        square.setTag("C-5");
        square.setArea(square.area());
        square.printDescription();
        String expected = outContent.toString();
        String actual = "Tag : C-5" + "\n";
              actual += "Figure Type : Square" + "\n";
              actual += "Area : 100.0" + "\n";
        assertEquals(expected, actual);
    }

    @Test
    public void testDrawTxt() {
        Square square = new Square(5);
        square.drawTxt();
        String expected = outContent.toString();
        String actual = "*****" + "\n";
              actual += "*****" + "\n";
              actual += "*****" + "\n";
              actual += "*****" + "\n";
              actual += "*****" + "\n";
        assertEquals(expected, actual);
    }
}
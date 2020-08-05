package samuel.practices.third.b;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Equals;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FigureTesting {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private ByteArrayInputStream in;

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
    public void testDisplayMenu() {

        String expected = "1.- Create rectangle" + "\n";
              expected += "2.- Create square" + "\n";
              expected += "3.- Display figure" + "\n";
              expected += "0.- Exit" + "\n";
        Menu menu = new Menu();
        menu.displayMenu();
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateRectangle() {
        in = new ByteArrayInputStream("5\n3".getBytes());
        System.setIn(in);

        String expected = "Please enter the base of the rectangle" + "\n";
               expected+= "Please enter the height of the rectangle" + "\n";

        Menu menu = new Menu();
        menu.optionRectangle();
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testDrawRectangle() {
        in = new ByteArrayInputStream("5\n3".getBytes());
        System.setIn(in);
        String expected = "*****" + "\n";
              expected += "*****" + "\n";
              expected += "*****" + "\n";

        Menu menu = new Menu();
        menu.optionRectangle();
        outContent.reset();
        menu.optionDisplayFigure();
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testCreateSquare() {
        in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);

        String expected = "Please enter the side of the square" + "\n";

        Menu menu = new Menu();
        menu.optionSquare();
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testDrawSquare() {
        in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        String expected = "*****" + "\n";
              expected += "*****" + "\n";
              expected += "*****" + "\n";
              expected += "*****" + "\n";
              expected += "*****" + "\n";

        Menu menu = new Menu();
        menu.optionSquare();
        outContent.reset();
        menu.optionDisplayFigure();
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidOption() {
        in = new ByteArrayInputStream("4\n0".getBytes());
        System.setIn(in);

        Menu menu = new Menu();
        menu.setOption();
        menu.optionDisplayFigure();
        String actual = outContent.toString();
        String expected = "Please select numbers from 0 to 3" + "\n";
              expected += "1.- Create rectangle" + "\n";
              expected += "2.- Create square" + "\n";
              expected += "3.- Display figure" + "\n";
              expected += "0.- Exit" + "\n";
        assertEquals(expected, actual);
    }
}
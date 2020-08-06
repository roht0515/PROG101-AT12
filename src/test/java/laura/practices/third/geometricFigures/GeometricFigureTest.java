package laura.practices.third.geometricFigures;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeometricFigureTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    Rectangle rectangle = new Rectangle("r-1", 2, 3);
    Square square = new Square("s-1", 2);

    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    
    @Test
    public void testprintDescriptionGeometricFigure(){
        GeometricFigure fGeometricFigure =new GeometricFigure("f");
        fGeometricFigure.printDescription();
        String expected = "";
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testprintDescriptionRectangle(){
        String expected = "Tag: r-1\nFigure Type: Rectangle\nArea: 6.0";
        rectangle.printDescription(rectangle);
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testDrawTxtRectangle(){
        String expected = "***\n***\n";
        rectangle.drawTxt();
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testprintDescriptionSquare(){
        String expected = "Tag: s-1\nFigure Type: Square\nArea: 4.0";
        square.printDescription(square);
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testDrawTxtSquare(){
        String expected = "**\n**\n";
        square.drawTxt();
        assertEquals(expected, outContent.toString());
    }
}

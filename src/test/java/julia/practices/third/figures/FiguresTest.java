package julia.practices.third.figures;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FiguresTest {
    
    @Test
    public void testGetTagRectangle() {
        GeometricFigure figure = new Rectangle(3,3,"R-1");
        String expected = "R-1";
        String actual = figure.getTag();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTypeFigure() {
        GeometricFigure square = new Square(3,3,"C-4");
        String expected = "Square";
        String actual = square.getFigureType();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintDescriptionForRectangleSinceGeometricFigure() {
        GeometricFigure geometricFigure = new Rectangle(2,4, "R-2");
        String expected = "Tag: R-2"+"\n" +
                          "Figure Type: Rectangle" +"\n"+
                          "Area: 8.0";
        String actual = geometricFigure.printDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintDescriptionForSquareSinceGeometricFigureVariable() {
        GeometricFigure square = new Square(4,4,"C-1");
        String expected = "Tag: C-1"+"\n" +
                          "Figure Type: Square" +"\n"+
                          "Area: 16.0";
        String actual = square.printDescription();
        assertEquals(expected, actual);
    }

}

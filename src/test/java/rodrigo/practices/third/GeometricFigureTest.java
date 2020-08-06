package rodrigo.practices.third;
import static org.junit.Assert.*;
import org.junit.Test;

public class GeometricFigureTest {
    @Test
    public void testDrawRectangleFigure () {
        GeometricFigure geoFigure =  new Rectangle(5, 4,"R-1");
        String expected = "*****\n*****\n*****\n*****";
        assertEquals(expected, geoFigure.drawTxt());
    }

    @Test
    public void testPrintExpectedInformation () {
        GeometricFigure geoFigure =  new Rectangle(5, 4,"R-1");
        String expected = "Tag: R-1\n" +
                          "Figure Type: Rectangle\n" +
                          "Area: 20.0";
        assertEquals(expected, geoFigure.printDescription());
    }

    @Test
    public void testGetAreaFromRectangle() {
        GeometricFigure geoFigure =  new Rectangle(5, 4,"R-1");
        double expected = 20.0;
        assertEquals(expected, geoFigure.area(),0);
    }

    @Test
    public void testGetTypeOfFigure() {
        GeometricFigure geoFigure =  new Rectangle(5, 4,"R-1");
        String expected = "Rectangle";
        assertEquals(expected, geoFigure.getFigureType());
    }

    @Test
    public void testDrawSquareFigure() {
        GeometricFigure geoFigure =  new Square(3, 3,"C-1");
        String expected = "***\n***\n***";
        assertEquals(expected, geoFigure.drawTxt());
    }

    @Test
    public void testPrintExpectedInformationOfSquare() {
        GeometricFigure geoFigure =  new Square(5, 5,"C-1");
        String expected = "Tag: C-1\n" +
                "Figure Type: Square\n" +
                "Area: 25.0";
        assertEquals(expected, geoFigure.printDescription());
    }

    @Test
    public void testGetAreaFromSquare() {
        GeometricFigure geoFigure =  new Square(5, 5,"C-1");
        double expected = 25.0;
        assertEquals(expected, geoFigure.area(),0);
    }

    @Test
    public void testGetSquareTypeOfFigure() {
        GeometricFigure geoFigure =  new Square(5, 5,"C-1");
        String expected = "Square";
        assertEquals(expected, geoFigure.getFigureType());
    }
}
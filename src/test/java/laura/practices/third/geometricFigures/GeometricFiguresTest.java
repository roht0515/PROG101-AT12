package laura.practices.third.geometricFigures;

import static org.junit.Assert.*;
import org.junit.Test;

public class GeometricFiguresTest {
    
    @Test
    public void testprintDescriptionRectangle(){
        String expected = "Tag: " + "r-5" + "\n"
                            + "Figure Type: "+ "Rectangle" + "\n"
                            + "Area: " + "6.0"
        GeometricFigure figure = new GeometricFigure(0, "r-5");
        Rectangle rectangle = new Rectangle(0, 2, 3);
        figure.printDescription(rectangle);
        assertEquals(expected, figure.printDescription(rectangle););
    }
}
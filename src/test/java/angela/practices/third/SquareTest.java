package angela.practices.third;
import angela.practices.third.figure.Square;
import angela.practices.third.figure.Square;
import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void getFigureType() {
        Square square = new Square(1, "C-1");
        String expected = "Square";
        String actual = square.getFigureType();
        assertEquals(expected, actual);
    }
    @Test
    public void calculateArea() {
        Square square = new Square(5, "C-5");
        double expected = 25.0;
        double actual = square.area();
        assertEquals(expected, actual, 1);
    }
    @Test
    public void getArea() {
        Square square = new Square(6, "C-6");
        double expected = 36.0;
        double actual = square.area();
        assertEquals(expected, actual, 1);
    }
    @Test
    public void getDescription() {
        Square square = new Square(4, "C-4");
        String expected = "Tag : C-4\n" +
                "Figure type : Square\n" +
                "Area : 16.0";
        square.printDescription();
        String actual = square.getDescription();
        assertEquals(expected, actual);
    }
}



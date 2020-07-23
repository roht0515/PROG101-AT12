import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void testSomeNumbers(){
        Calculator calc = new Calculator();
        int actual = calc.add("0,0");
        int expected = 0;
        assertEquals(expected,actual);
    }
}
package example;

import org.junit.Test;
import static org.junit.Assert.*;
import example.Calculator;

public class CalculatorTest {

    @Test
    public void testSomeNumbers(){
        Calculator calc = new Calculator();
        int actual = calc.add("0,0");
        int expected = 0;
        assertEquals(expected,actual);
    }
}
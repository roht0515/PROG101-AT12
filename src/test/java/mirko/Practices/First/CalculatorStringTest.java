import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
public class CalculatorStringTest {
    @Test
    public void testAddSomeNumbers() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add("1,2");
        int expected = 3;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testAddEmptyString() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add("");
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void testAddZeroString() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add("0");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNineNumbers() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add("1,2,3,4,5,6,7,8,9");
        int expected = 45;
        assertEquals(expected, actual);
    }

    @Test
    public void testAddOneNumber() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add("2");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testBadDelimiter() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add("1.2");
        int expected = 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddNewLineAndCommaDelimiter() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add("1\n2,3");
        int expected = 6;
        assertEquals(expected,actual);
    }
    @Test
    public void testAddNewLineDelimiterWithThreeNumbers() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add("1\n2\n3");
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void testSetDelimiterSemicolons() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add ("//;\n4;6");
        int expected = 10;
        assertEquals(expected,actual);
    }

    @Test
    public void testOneNegativeNumber() throws NotAllowNegativeNumbers{
        String actual = "";
        String expected = "Negatives not allowed: -2";
        try{
            CalculatorString.add("1,-2");
        } catch(Exception e){
            actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }

    @Test
    public void testTwoNegativeNumbersNotAllowed() throws NotAllowNegativeNumbers {
        String actual = "";
        String expected = "Negatives not allowed: -1 -2";
        try {
            CalculatorString.add("-1,-2");
        }
        catch (Exception e){
            actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }
    
    @Test
    public void testOneNumberGreaterThan1000() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add("1000,2,2000,4");
        int expected = 1006;
        assertEquals(expected,actual);
    }

    @Test
    public void testAddSetDelimiterWithAnyLength() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add ("//[-f+]\n1-f+2-f+3");
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void testAddSetTwoDelimiterWithAnyLength() throws NotAllowNegativeNumbers{
        int actual = CalculatorString.add ("//[-f+][oO]\n1oO2-f+3");
        int expected = 6;
        assertEquals(expected,actual);
    }
    
}

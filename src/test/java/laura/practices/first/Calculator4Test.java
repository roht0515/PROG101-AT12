package rodrigo.practices.first;

import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator4Test {
    @Test
    public void testSomeNumbers(){
        int actual = Calculator4.add("1,2");
        int expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    public void testEmptyString(){
        int actual = Calculator4.add("");
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void testZeroString() {
        int actual = Calculator4.add("0");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeNumbers() {
        int actual = Calculator4.add("-1,-2,-1");
        int expected = -4;
        assertEquals(expected, actual);
    }

    @Test
    public void testMoreNumbers() {
        int actual = Calculator4.add("1,2,3,4,5,6,7,8,9");
        int expected = 45;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testOneEmptySpaceAndOneNegativeNumberStringReturnExceptionWithCorrectMessage() throws Exception {
        String expected = "negatives not allowed: -1";
        String actual = "";
        try {
            Calculator4.isNegativeNumber(-1);
        } catch (Exception e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }
    
    @Test
    public void testOneEmptySpaceAndOnePositiveNumberString(){
        int actual = Calculator4.add(" ,1");
        int expected = 1;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testTwoEmptySpaceAndOnePositiveNumberString(){
        int actual = Calculator4.add(" , ,1");
        int expected = 1;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testTwoNegativeNumbersAndOnePositiveNumberString(){
        int actual = Calculator4.add("-2,-5,1");
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    public void testOneCharacterAndOnePositiveNumberString(){
        int actual = Calculator4.add("a,1");
        int expected = 1;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testOneCharacterAndOneNegativeNumberString(){
        int actual = Calculator4.add("a,-1");
        int expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    public void testZeroNumberAndOneNegativeNumberString(){
        int actual = Calculator4.add("a,-1");
        int expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    public void testTwoCharactersString(){
        int actual = Calculator4.add("a,b");
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void testNumbersAndCharactersString(){
        int actual = Calculator4.add("a,1,d,2");
        int expected = 3;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testNumbersOfTwoDigitsString(){
        int actual = Calculator4.add("21,11,15");
        int expected = 47;
        assertEquals(expected,actual);
    }
    
}

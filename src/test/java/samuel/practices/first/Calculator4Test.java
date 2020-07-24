package samuel.practices.first;

import org.junit.Test;
import static org.junit.Assert.*;
public class Calculator4Test {

    @Test
    public void testSomeNumbers(){
        int actual = new Calculator4().add("1,2");
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void testEmptyString(){
        int actual = new Calculator4().add("");
        int expected = 0;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testZeroString() {
        int actual = new Calculator4().add("0");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testMoreNumbers() {
        int actual = new Calculator4().add("1,2,3,4,5,6,7,8,9");
        int expected = 45;
        assertEquals(expected, actual);
    }

    @Test
    public void testOneEmptySpaceAndOnePositiveNumberString(){
        int actual = new Calculator4().add(" ,1");
        int expected = 1;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testTwoEmptySpaceAndOnePositiveNumberString(){
        int actual = new Calculator4().add(" , ,1");
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void testOneCharacterAndOnePositiveNumberString(){
        int actual = new Calculator4().add("a,1");
        int expected = 1;
        assertEquals(expected,actual);
    }
      
    @Test
    public void testTwoCharactersString(){
        int actual = new Calculator4().add("a,b");
        int expected = 0;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testNumbersAndCharactersString(){
        int actual = new Calculator4().add("a,1,d,2");
        int expected = 3;
        assertEquals(expected,actual);
    }
    
    @Test
    public void testNumbersOfTwoDigitsString(){
        int actual = new Calculator4().add("21,11,15");
        int expected = 47;
        assertEquals(expected,actual);
    }

    @Test
    public void testNumbersDigitsDelimiterCustom(){
        int actual = new Calculator4().add("//;\n1;2;3");
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void testNumbersDelimiterCustomDot(){
        int actual = new Calculator4().add("//.\n1.2.3");
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void testNegativeNumberReturnsException() {
        String expected = "The number is negative: -1";
        String actual = "";
        
        Calculator4 calc = new Calculator4();
        calc.add("-1");
        try {
            calc.isValid();
        } catch (ArithmeticException e) {
            actual = e.getMessage();
        }
    }
    
    @Test
    public void testNegativeWithSpaceNumberReturnsException(){
        String expected = "The number is negative: -1";
        String actual = "";
    
        Calculator4 calc = new Calculator4();
        calc.add(" , -1");
        try {
            calc.isValid();
        } catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }
    
    
    @Test
    public void testNegativeNumbersReturnsException() throws Exception {
        String expected = "The number is negative: -2\nThe number is negative: -5";
        String actual = "";
        Calculator4 calc = new Calculator4();
        calc.add("-2,-5,1");
        try {
            calc.isValid();
        } catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegativeNumberWhitLetterReturnException(){
        String expected = "The number is negative: -1";
        String actual = "";
        Calculator4 calc = new Calculator4();
        calc.add("a, -1");
        try {
            calc.isValid();
        } catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeNumberReturnsExceptionCustumDelimiter(){
        String expected = "The number is negative: -1";
        String actual = "";
        Calculator4 calc = new Calculator4();
        calc.add("//.\n-1.2.40");
        try {
            calc.isValid();
        } catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }
}

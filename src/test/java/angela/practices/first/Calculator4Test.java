package angela.practices.first;

import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator4Test {
    @Test
    public void testSomeNumbers() throws Exception{
        int actual = Calculator4.add("1,2");
        int expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    public void testEmptyString() throws Exception{
        int actual = Calculator4.add("");
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void testZeroString() throws Exception{
        int actual = Calculator4.add("0");
        int expected = 0;
        assertEquals(expected, actual);
    }
    //test changed
    @Test (expected = ArithmeticException.class)
    public void testNegativeNumbers() throws Exception{
        int actual = Calculator4.add("-1,-2,-1");
    }
    @Test
    public void testNegativeNumbersWithCorrectMessage() throws Exception{
        String expected = "The number is negative, number is:-1-2-1";
        String actual = "";
        try {
            Calculator4.add("-1,-2,-1");
        }
        catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testMoreNumbers() throws Exception{
        int actual = Calculator4.add("1,2,3,4,5,6,7,8,9");
        int expected = 45;
        assertEquals(expected, actual);
    }
    //test changed
    @Test (expected = ArithmeticException.class)
    public void testOneEmptySpaceAndOneNegativeNumberString() throws Exception{
        int actual = Calculator4.add(" ,-1");
    }
    @Test
    public void testOneEmptySpaceAndOneNegativeNumberWithCorrectMessage() throws Exception{
        String expected = "The number is negative, number is:-1";
        String actual = "";
        try {
            Calculator4.add(" ,-1");
        }
        catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testOneEmptySpaceAndOnePositiveNumberString() throws Exception{
        int actual = Calculator4.add(" ,1");
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void testTwoEmptySpaceAndOnePositiveNumberString() throws Exception{
        int actual = Calculator4.add(" , ,1");
        int expected = 1;
        assertEquals(expected,actual);
    }
    //test changed
    @Test (expected = ArithmeticException.class)
    public void testTwoNegativeNumbersAndOnePositiveNumberString() throws Exception{
        int actual = Calculator4.add("-2,-5,1");
    }
    @Test
    public void testTwoNegativeNumbersAndOnePositiveNumberWithCorrectMessage() throws Exception{
        String expected = "The number is negative, number is:-2-5";
        String actual = "";
        try {
            Calculator4.add("-2,-5,1");
        }
        catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testOneCharacterAndOnePositiveNumberString() throws Exception{
        int actual = Calculator4.add("a,1");
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testOneCharacterAndOneNegativeNumberString() throws Exception{
        int actual = Calculator4.add("a,-1");
    }
    @Test
    public void testOneCharacterAndOneNegativeNumberStringWithCorrectMessage() throws Exception{
        String expected = "The number is negative, number is:-1";
        String actual = "";
        try {
            Calculator4.add("a,-1");
        }
        catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }

    @Test (expected = ArithmeticException.class)
    public void testZeroNumberAndOneNegativeNumberString() throws Exception{
        int actual = Calculator4.add("0,-1");
    }
    @Test
    public void testZeroNumberAndOneNegativeNumberStringWithCorrectMessage() throws Exception{
        String expected = "The number is negative, number is:-1";
        String actual = "";
        try {
            Calculator4.add("0,-1");
        }
        catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }
    @Test
    public void testTwoCharactersString() throws Exception{
        int actual = Calculator4.add("a,b");
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void testNumbersAndCharactersString() throws Exception{
        int actual = Calculator4.add("a,1,d,2");
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void testNumbersOfTwoDigitsString() throws Exception{
        int actual = Calculator4.add("21,11,15");
        int expected = 47;
        assertEquals(expected,actual);
    }

    @Test
    public void testNumbersWithTwoDelimiterString() throws Exception{
        int actual = Calculator4.add("1\n2,3\n4");
        int expected = 10;
        assertEquals(expected,actual);
    }

    @Test
    public void testNumbersChangeDelimiterString() throws Exception{
        int actual = Calculator4.add("//;\n1;2");
        int expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    public void testNumbersBiggerThan1000String() throws Exception{
        int actual = Calculator4.add("2,1001");
        int expected = 2;
        assertEquals(expected,actual);
    }
    @Test
    public void testNumbersAnyLenghtDelimiterString() throws Exception{
        int actual = Calculator4.add("//[-]\\n1-2-3");
        int expected = 6;
        assertEquals(expected,actual);
    }
    @Test
    public void testNumbersMultipleDelimiterString() throws Exception{
        int actual = Calculator4.add("//[-][%]\\n1-2%3");
        int expected = 6;
        assertEquals(expected,actual);
    }
    @Test
    public void testTestPositiveNumberReturnTrue()throws Exception{
        boolean actual = Calculator4.isPositive(1);
        assertTrue(actual);
    }
    @Test(expected = ArithmeticException.class)
    public void testTestNegativeNumberReturnException() throws Exception{
        boolean actual = Calculator4.isPositive(-1);
    }
    @Test
    public void testTestNegativeNumberReturnExceptionWithCorrectMessage() throws Exception{
        String expected = "The number is negative, number is: -1";
        String actual = "";
        try {
            Calculator4.isPositive(-1);
        }
        catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }
}

package julia.practices.first;

import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator4Test {

    @Test
    public  void testSomeNumbers() throws NegativeNumbersInString{
        int actual = Calculator4.add("1,2");
        int expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    public void testEmptyString() throws NegativeNumbersInString{
        int actual = Calculator4.add("");
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void testZeroString() throws NegativeNumbersInString {
        int actual = Calculator4.add("0");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testMoreNumbers() throws NegativeNumbersInString {
        int actual = Calculator4.add("1,2,3,4,5,6,7,8,9");
        int expected = 45;
        assertEquals(expected, actual);
    }

    @Test
    public void testOneEmptySpaceAndOnePositiveNumberString() throws NegativeNumbersInString {
        int actual = Calculator4.add(" ,1");
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void testTwoEmptySpaceAndOnePositiveNumberString() throws NegativeNumbersInString{
        int actual = Calculator4.add(" , ,1");
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void testTwoNegativeNumbersAndOnePositiveNumberString(){
        String expected = "the negative numbers: -2-1";
        String actual = "";
        try{
            Calculator4.add("-2,-1,1,7");
        }catch (Exception e){
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testOneCharacterAndOnePositiveNumberString() throws NegativeNumbersInString {
        int actual = Calculator4.add("a,1");
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void testTwoCharactersString() throws NegativeNumbersInString{
        int actual = Calculator4.add("a,b");
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void testNumbersAndCharactersString() throws NegativeNumbersInString {
        int actual = Calculator4.add("a,1,d,2");
        int expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    public void testNumbersOfTwoDigitsString() throws NegativeNumbersInString {
        int actual = Calculator4.add("21,11,15");
        int expected = 47;
        assertEquals(expected,actual);
    }

    @Test
    public void testNumbersWithNewLineString() throws NegativeNumbersInString {
        int actaul = Calculator4.add("1\n2,3");
        int expected = 6;
        assertEquals(expected, actaul);
    }

    @Test
    public void testNumbersBiggerThanThousandIgnoredString() throws NegativeNumbersInString {
        int actual = Calculator4.add("2,1000,1001");
        int expected = 1002;
        assertEquals(expected, actual);
    }

    @Test
    public void testNumbersWithDelimiterCustomString() throws NegativeNumbersInString {
        int actual = Calculator4.add("//;\n1;2");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testOneNumberNegativeTrowException() throws NegativeNumbersInString {
        String expected = "the negative numbers: -2-1";
        String actual = "";
        try{
            Calculator4.add("abc-2,-1");
        }catch (Exception e){
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }
    @Test
    public void testDoesNumbersNegativeTrue() {
        boolean actual = Calculator4.doesNumberNegative("abc-2");
        assertTrue(actual);
    }
    @Test
    public void testDoesNumbersNegativeFalse() {
        boolean actual = Calculator4.doesNumberNegative("anv2");
        assertFalse(actual);
    }
    @Test
    public void testMessageExceptionOneNegativeNumber() {
        String actual = Calculator4.messageException("-2");
        String expected = "the negative numbers: -2";
        assertEquals(expected, actual);
    }
    @Test
    public void testMessageExceptionTwoMoreNegativeNumbers() {
        String actual = Calculator4.messageException("-2,-3a");
        String expected = "the negative numbers: -2-3";
        assertEquals(expected, actual);
    }
}
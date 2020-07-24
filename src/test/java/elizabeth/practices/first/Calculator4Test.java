package elizabeth.practices.first;

import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator4Test {
    @Test
    public void testAddNewLine() throws Exception {
        int actual = Calculator4.add("1\n22,3");
        int expected = 26;
        assertEquals(expected,actual);
    }

    @Test
    public void testMoreNumbersNewDelimiter() throws Exception {
        int actual = Calculator4.add("//%\n1%22,3");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNumberWithTwoDelimiters() throws Exception {
        int actual = Calculator4.add("//[%][,]\n1%22,3");
        int expected = 26;
        assertEquals(expected, actual);
    }
    @Test
    public void testGetDelimiters(){
        String actual = Calculator4.valueOfBrackets("%,");
        String expected = "\\%,";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetDelimitersOfBrackets(){
        String actual = Calculator4.extraer("%,");
        String expected = "%,";
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNewDelimiter() throws Exception {
        int actual = Calculator4.add("//;\n1;2");
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void testAddTwoDelimiter() throws Exception {
        int actual = Calculator4.add("//[;][,]\n1;2,3");
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void testAddTwoDelimiterBN() throws Exception {
        int actual = Calculator4.add("//[;][,]\n1001;2,3");
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    public void testAddTwoDelimiterNN() throws Exception {
        String expected ="Negatives not allowed: -1,-9,";
        String actual = "";
        try {
            Calculator4.add("//[;][,]\n-1;2;8000,-9");
        }catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }

    @Test
    public void testAddNegativeNumbers() throws Exception {
        String expected ="Negatives not allowed: -1,-9,";
        String actual = "";
        try {
            Calculator4.add("//;\n-1;2;8;-9");
        }catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected,actual);
    }

    @Test
    public void tesPositiveNumberReturnsTrue() throws Exception{
        boolean actual = Calculator4.isPositive("5");
        assertTrue(actual);
    }

    @Test
    public void testAddBigerNumbers() throws Exception {
        int actual = Calculator4.add("//;\n10001;2");
        int expected = 2;
        assertEquals(expected, actual);
    }
}


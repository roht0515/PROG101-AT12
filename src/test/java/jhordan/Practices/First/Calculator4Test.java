package jhordan.Practices.First;

import org.junit.Test;
import org.junit.rules.ExpectedException;

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
    public void testZeroString() throws Exception {
        int actual = Calculator4.add("0");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testNineNumbers() throws Exception {
        int actual = Calculator4.add("1,2,3,4,5,6,7,8,9");
        int expected = 45;
        assertEquals(expected, actual);
    }
    @Test
    public void testAddNewLineAndCommaString() throws Exception {
        int actual = Calculator4.add("1\n2,3");
        int expected = 6;
        assertEquals(expected,actual);
    }
    @Test
    public void testAddNewLineWithThreeNumbersString() throws Exception {
        int actual = Calculator4.add("1\n2\n3");
        int expected = 6;
        assertEquals(expected,actual);
    }
    @Test
    public void testWithDelimiterSemicolonsString() throws Exception {
        int actual = Calculator4.add ("//;\n4;6");
        int expected = 10;
        assertEquals(expected,actual);
    }

    @Test
    public void testNegativeNumbersNotPermitted() throws Exception {
        try {
            String expected = "the number is negative -1";
            int actual = Calculator4.add("-1,-2");
            assertEquals(expected, actual);
        }
        catch (Exception e){

        }
    }
    @Test
    public void testBiggerThanOneThousand() throws Exception{
        int actual = Calculator4.add("1000,2,2000,4");
        int expected = 6;
        assertEquals(expected,actual);
    }


}

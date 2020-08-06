package elizabeth.practices.fourth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnderGraduateStudentTest {

    private static final int  NOTA_1 = 60;
    private static final int  NOTA_2 = 50;
    private static final int  NOTA_3 = 53;
    private static final int  NEGATIVE_NOTA = -50;
    @Test
    public void testGetTestsScore() {
        Student ana = new UnderGraduateStudent("Ana");
        ana.setTestScore(0, NOTA_1);
        ana.setTestScore(1, NOTA_2);
        ana.setTestScore(2, NOTA_2);
        int actual = ana.getTestScore();
        int expected = NOTA_3;
        assertEquals(expected, actual);
    }
    @Test
    public void testGetTestsScoreWithNegativeScore() {
        Student ana = new UnderGraduateStudent("Ana");
        String actual = "";
        String expected = "Negatives number is not allowed.";
        try {
            ana.setTestScore(0, NEGATIVE_NOTA);
            ana.setTestScore(1, NOTA_2);
            ana.setTestScore(2, NOTA_1);
        } catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testSetTestsScoreWithNegativeScore() {
        Student ana = new UnderGraduateStudent("Ana");
        String actual = "";
        String expected = "Negatives number is not allowed.";
        try {
            ana.setTestScore(0, NEGATIVE_NOTA);
        } catch (ArithmeticException e) {
            actual = e.getMessage();
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testComputerCourseGradeFailed() {
        Student ana = new UnderGraduateStudent("Ana");
        ana.setTestScore(0, NOTA_2);
        ana.setTestScore(1, NOTA_2);
        ana.setTestScore(2, NOTA_2);
        String actual = ana.computeCourseGrade();
        String expected = "Failed";
        assertEquals(expected, actual);
    }

    @Test
    public void testComputerCourseGradePassed() {
        Student ana = new UnderGraduateStudent("Ana");
        ana.setTestScore(0, NOTA_1);
        ana.setTestScore(1, NOTA_1);
        ana.setTestScore(2, NOTA_1);
        String actual = ana.computeCourseGrade();
        String expected = "Passed";
        assertEquals(expected, actual);
    }
}

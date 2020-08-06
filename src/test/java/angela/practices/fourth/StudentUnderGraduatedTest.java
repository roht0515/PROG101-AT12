package angela.practices.fourth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentUnderGraduatedTest {
    @Test
    public void computeCourseGradeWithTestsOver51() {
        StudentUnderGraduated student = new StudentUnderGraduated("Jose");
        student.addTest(new int[]{51, 52, 55});
        String expected = "Passed";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public void computeCourseGradeWithTestsOver71() {
        StudentUnderGraduated student = new StudentUnderGraduated("Jose");
        student.addTest(new int[]{71, 72, 75});
        String expected = "Passed";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public void computeCourseGradeWithTestsUnder51() {
        StudentUnderGraduated student = new StudentUnderGraduated("Jose");
        student.addTest(new int[]{50, 50, 50});
        String expected = "Failed";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);
    }
}

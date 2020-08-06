package angela.practices.fourth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentGraduatedTest {
    @Test
    public void computeCourseGradeWithTestsOver51() {
        StudentGraduated student = new StudentGraduated("Jose");
        student.addTest(new int[]{51, 52, 55});
        String expected = "Failed";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public void computeCourseGradeWithTestsOver71() {
        StudentGraduated student = new StudentGraduated("Jose");
        student.addTest(new int[]{71, 72, 75});
        String expected = "Passed";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public void computeCourseGradeWithTestsUnder71() {
        StudentGraduated student = new StudentGraduated("Jose");
        student.addTest(new int[]{70, 70, 70});
        String expected = "Failed";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);
    }
}

package jhordan.Practices.Fourth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnderGraduatedStudentTest {
    @Test
    public void testComputerCourseGradeApproved() {
        int [] test = {55,55,55};
        UnderGraduatedStudent undergraduatedgtudent = new UnderGraduatedStudent("Pepe",test);
        String expected = "approved";
        String actual = undergraduatedgtudent.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public void testComputerCourseGradeReprobate() {
        int [] test = {35,35,35,35,35};
        UnderGraduatedStudent undergraduatedgtudent = new UnderGraduatedStudent("Pepe",test);
        String expected = "reprobated";
        String actual = undergraduatedgtudent.computeCourseGrade();
        assertEquals(expected, actual);
    }
}

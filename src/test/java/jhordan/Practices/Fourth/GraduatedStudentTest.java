package jhordan.Practices.Fourth;

import jhordan.Practices.Second.Store;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraduatedStudentTest {

    @Test
    public void testComputerCourseGradeApproved() {
        int [] test = {75,75,75};
        GraduatedStudent graduatedStudent = new GraduatedStudent("Pepe",test);
        String expected = "approved";
        String actual = graduatedStudent.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public void testComputerCourseGradeReprobated() {
        int [] test = {55,55,55,55,55};
        GraduatedStudent graduatedStudent = new GraduatedStudent("Pepe",test);
        String expected = "reprobated";
        String actual = graduatedStudent.computeCourseGrade();
        assertEquals(expected, actual);
    }
}

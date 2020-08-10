package laura.practices.fourth;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentTest {

    Student student = new Student("jose");

    @Test
    public void testSetCantTestStudent() {
        student.setCantTest(1);
        assertEquals(1, student.tests.length);
    }

    @Test
    public void testGetTestScore(){
        student.setCantTest(1);
        student.setTestScore(51, 0);
        assertEquals(51, student.getTestScore(0));
    }
    @Test
    public void testSetMinNoteStudent() {
        student.setMinNote(51);
        assertEquals(51, student.minNoteToAproval);
        
    }

    @Test
    public void testComputeCourseGradeStudent() {
        student.setCantTest(2);
        student.setMinNote(51);
        student.setTestScore(51, 0);
        student.setTestScore(45, 1);
        String expected = "REPROVED";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public void testComputeCourseGradeGraduatedReproved() {
        Graduated graduated = new Graduated("jose");
        graduated.setCantTest(3);
        graduated.setTestScore(54, 0);
        graduated.setTestScore(54, 1);
        graduated.setTestScore(54, 2);
        String expected = "REPROVED";
        String actual = graduated.computeCourseGrade();
        assertEquals(expected, actual);
        
    }

    @Test
    public void testComputeCourseGradeGraduatedAproved() {
        Graduated graduated = new Graduated("jose");
        graduated.setCantTest(3);
        graduated.setTestScore(87, 0);
        graduated.setTestScore(49, 1);
        graduated.setTestScore(100, 2);
        String expected = "APROVED";
        String actual = graduated.computeCourseGrade();
        assertEquals(expected, actual);
        
    }

    @Test
    public void testComputeCourseGradeUnderGraduatedReproved() {
        UnderGraduate underGraduate = new UnderGraduate("jose");
        underGraduate.setCantTest(3);
        underGraduate.setTestScore(45, 0);
        underGraduate.setTestScore(14, 1);
        underGraduate.setTestScore(35, 2);
        String expected = "REPROVED";
        String actual = underGraduate.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public void testComputeCourseGradeUnderGraduatedAproved() {
        UnderGraduate underGraduate = new UnderGraduate("jose");
        underGraduate.setCantTest(3);
        underGraduate.setTestScore(65, 0);
        underGraduate.setTestScore(74, 1);
        underGraduate.setTestScore(87, 2);
        String expected = "APROVED";
        String actual = underGraduate.computeCourseGrade();
        assertEquals(expected, actual);
    }
}

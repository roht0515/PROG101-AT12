package student;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    
    @Test
    public void addANewStudentWithoutName() {
        Student student1 = new Student();
        String actual = student1.getName();
        String expected = "";
        assertEquals(actual, expected);
    }

    @Test
    public void testAddANewStudentWithName() {
        Student student1 = new Student("Marcela");
        String actual = student1.getName();
        String expected = "Marcela";
        assertEquals(actual, expected);
    }

    @Test
    public void testAddANewUnderGraduatedStudentWithName() {
        Student student1 = new UnderGraduatedStudent("Peter");
        String actual = student1.getName();
        String expected = "Peter";
        assertEquals(actual, expected);
    }

    @Test
    public void testAddANewGraduatedStudentWithName() {
        Student student1 = new GraduatedStudent("Roxana");
        String actual = student1.getName();
        String expected = "Roxana";
        assertEquals(actual, expected);
    }

    @Test
    public void testGradeUpAnApprovedUnderGraduatedStudent() {
        Student student1 = new UnderGraduatedStudent("Amanda");
        int [] grades = new int [] {50, 50, 60};
        student1.gradeUp(grades);
        String mark = student1.computeCourseGrade();
        student1.setCourseGrade(mark);
        String actual = student1.getCourseGrade();
        String expected = "Approved";
        assertEquals(actual, expected);
    }

    @Test
    public void testGradeUpAnApprovedGraduatedStudent() {
        Student student1 = new GraduatedStudent("Jaime");
        int [] grades = new int [] {70, 70, 80};
        student1.gradeUp(grades);
        String mark = student1.computeCourseGrade();
        student1.setCourseGrade(mark);
        String actual = student1.getCourseGrade();
        String expected = "Approved";
        assertEquals(actual, expected);
    }

    @Test
    public void testGradeUpAFailedUnderGraduatedStudent() {
        Student student1 = new UnderGraduatedStudent("Kary");
        int [] grades = new int [] {50, 50, 50};
        student1.gradeUp(grades);
        String mark = student1.computeCourseGrade();
        student1.setCourseGrade(mark);
        String actual = student1.getCourseGrade();
        String expected = "Failed";
        assertEquals(actual, expected);
    }

    @Test
    public void testGradeUpAFailedGraduatedStudent() {
        Student student1 = new GraduatedStudent("Bob");
        int [] grades = new int [] {70, 70, 70};
        student1.gradeUp(grades);
        String mark = student1.computeCourseGrade();
        student1.setCourseGrade(mark);
        String actual = student1.getCourseGrade();
        String expected = "Failed";
        assertEquals(actual, expected);
    }
}

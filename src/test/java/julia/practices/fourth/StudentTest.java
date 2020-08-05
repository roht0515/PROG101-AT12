package julia.practices.fourth;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public  void testReturnApprovedGraduateStudent() {
        int [] test = new int [] {80, 90, 60};
        Student student = new GraduateStudent("Juan");
        student.addScore(test);
        String expected = "approved";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public  void testReturnReprobateGraduateStudent() {
        int [] test = new int [] {70, 65, 69};
        Student student = new GraduateStudent("Luis");
        student.addScore(test);
        String expected = "reprobate";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);

    }

    @Test
    public  void testReturnApprovedUnderGraduateStudent() {
        int [] test = new int [] {80, 40, 60};
        Student student = new UnderGraduateStudent("Silvia");
        student.addScore(test);
        String expected = "approved";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);
    }

    @Test
    public  void testReturnReprobateUnderGraduateStudent() {
        int [] test = new int [] {60, 40, 30};
        Student student = new UnderGraduateStudent("carlos");
        student.addScore(test);
        String expected = "reprobate";
        String actual = student.computeCourseGrade();
        assertEquals(expected, actual);

    }
}

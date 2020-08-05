package samuel.practices.fourth;
import org.junit.Test;
import static org.junit.Assert.*;

public class GraduatedStudentTest {

    @Test
    public void testAprovalNote(){
        GraduatedStudent student = new GraduatedStudent();
        student.setName("Juan");
        student.setTestScore(1, 71);
        student.setTestScore(2, 71);
        student.setTestScore(3, 71);
        
        String actual = student.computeCourseGrade();
        String expected = "Yes";
        assertEquals(expected,actual);
    }

    @Test
    public void testNoAprovalNote(){
        GraduatedStudent student = new GraduatedStudent();
        student.setName("Juan");
        student.setTestScore(1, 50);
        student.setTestScore(2, 50);
        student.setTestScore(3, 50);
        
        String actual = student.computeCourseGrade();
        String expected = "No";
        assertEquals(expected,actual);
    }
}
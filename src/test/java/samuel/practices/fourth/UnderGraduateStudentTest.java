package samuel.practices.fourth;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnderGraduateStudentTest {

    @Test
    public void testAprovalNote(){
        UnderGraduateStudent student = new UnderGraduateStudent();
        student.setName("Juan");
        student.setTestScore(1, 51);
        student.setTestScore(2, 51);
        student.setTestScore(3, 51);
        
        String actual = student.computeCourseGrade();
        String expected = "Yes";
        assertEquals(expected,actual);
    }

    @Test
    public void testNoAprovalNote(){
        UnderGraduateStudent student = new UnderGraduateStudent();
        student.setName("Juan");
        student.setTestScore(1, 50);
        student.setTestScore(2, 50);
        student.setTestScore(3, 50);
        
        String actual = student.computeCourseGrade();
        String expected = "No";
        assertEquals(expected,actual);
    }
}
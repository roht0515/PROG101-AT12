package rodrigo.practices.third;
import static org.junit.Assert.*;
import org.junit.Test;
public class AbstracStudentTest {

    @Test
    public void testCollegeStudentApprove(){
        AbstracStudent student = new CollegeStudent("juan");
        int [] scores =  {60,52,53};
        student.setTestScore(scores);
        String  actual = student.computeCourseGrade();
        String expected = "Aprobado";
        assertEquals(expected,actual);
    }

    @Test
    public void testCollegeStudentReprove(){
        AbstracStudent student = new CollegeStudent("juan");
        int [] scores =  {44,32,53};
        student.setTestScore(scores);
        String  actual = student.computeCourseGrade();
        String expected = "Reprobado";
        assertEquals(expected,actual);
    }

    @Test
    public void testGraduateStudentApprove(){
        AbstracStudent student = new GraduateStudent("juan");
        int [] scores =  {73,74,72};
        student.setTestScore(scores);
        String  actual = student.computeCourseGrade();
        String expected = "Aprobado";
        assertEquals(expected,actual);
    }

    @Test
    public void testGraduateStudentReprove(){
        AbstracStudent student = new GraduateStudent("juan");
        int [] scores =  {68,72,66};
        student.setTestScore(scores);
        String  actual = student.computeCourseGrade();
        String expected = "Reprobado";
        assertEquals(expected,actual);
    }
}
package samuel.practices.fourth;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGetNameStudent() {
        Student student = new Student();
        student.setName("Civil");

        String actual = student.getName();
        String expected = "Civil";
        assertEquals(expected, actual);
    }
}
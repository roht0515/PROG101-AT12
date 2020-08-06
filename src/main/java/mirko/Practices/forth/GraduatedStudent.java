package student;

public class GraduatedStudent extends Student {
    static final int MIN_GRADE_OF_GRADUATED = 71;

    public GraduatedStudent(final String name) {
        super(name);
    }

    /**
    @return if "Approve" or "Failed"
    **/

    public String computeCourseGrade() {
        int avg = Integer.parseInt(super.computeCourseGrade());
        if (avg >= MIN_GRADE_OF_GRADUATED) {
            return "Approved";
        } else {
            return "Failed";
        }
    }
}

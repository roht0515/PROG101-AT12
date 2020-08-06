package student;

public class UnderGraduatedStudent extends Student {
    static final int MIN_GRADE_OF_UNDERGRADUATED = 51;

    public UnderGraduatedStudent(final String name) {
        super(name);
    }

    /**
    @return if "Approve" or "Failed"
    **/
    public String computeCourseGrade() {
        int avg = Integer.parseInt(super.computeCourseGrade());
        if (avg >= MIN_GRADE_OF_UNDERGRADUATED) {
            return "Approved";
        } else {
            return "Failed";
        }
    }
}

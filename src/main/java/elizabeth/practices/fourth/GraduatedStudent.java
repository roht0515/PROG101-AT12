package elizabeth.practices.fourth;

public class GraduatedStudent extends Student {
    private static final int MINIMUM_SCORE = 71;

    public GraduatedStudent(final String name) {
        super(name);
    }

    /**
     *
     * @return String computeCourseGrade
     */
    public String computeCourseGrade() {
        if (getTestScore() >= MINIMUM_SCORE) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
}

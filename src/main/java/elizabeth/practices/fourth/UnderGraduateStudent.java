package elizabeth.practices.fourth;

public class UnderGraduateStudent extends Student {
    private static final int MINIMUM_SCORE = 51;

    public UnderGraduateStudent(final String name) {
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

package angela.practices.fourth;

public class StudentGraduated extends Student {
    private static final int MINIMUM_SCORE = 71;

    public StudentGraduated(final String name) {
        super(name);
    }

    /**
     *
     * @return if the student is approved or not
     */
    public String computeCourseGrade() {
        if (getTestScore() >= MINIMUM_SCORE) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
}


package elizabeth.practices.fourth;

public class UnderGraduateStudent extends Student{
    private static final int MINIMUM_SCORE = 51;

    public UnderGraduateStudent(final String name) {
        super(name);
    }

    /**
     *
     * @return String
     */
    public String computeCourseGrade() {
        if (getTestScore() >= MINIMUM_SCORE) {
            return "Approved";
        } else {
            return "Didn't approve";
        }
    }
}

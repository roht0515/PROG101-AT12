package samuel.practices.fourth;

public class GraduatedStudent extends Student {

    protected static final int APPROVAL_NOTE = 71;
    /**
     *
     * @return String computeCourseGrade
     */
    public String computeCourseGrade() {

        int score = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            score += getTestScore(i);
        }
        double average =  score / NUM_OF_TESTS;

        if (average >= APPROVAL_NOTE) {
            return "Yes";
        }
        return "No";
    }
}

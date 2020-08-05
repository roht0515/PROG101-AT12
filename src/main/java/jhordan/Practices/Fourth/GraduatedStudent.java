package jhordan.Practices.Fourth;

public class GraduatedStudent extends Student {
    static final int MINIMUM_SCORE_TO_APPROBE = 71;
    public GraduatedStudent(final String name, final int[] test) {
        super(name, test);
    }
    /**Returns an String with the state aprrove or reprobated**/
    @Override
    public String computeCourseGrade() {
        String coursegrade = "reprobated";
        if (getTestScore(getTest()) >= MINIMUM_SCORE_TO_APPROBE) {
            coursegrade = "approved";
        }
        return coursegrade;
    }
}

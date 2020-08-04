package samuel.practices.fourth;

public class GraduatedStudent extends Student{

    protected static final int APPROVAL_NOTE = 71;

    public String computeCourseGrade() {

        int score = 0;
        for (int i = 0; i < test.length; i++) {
            score += test[i];
        }
        double note =  score / NUM_OF_TESTS;

        if (note >= APPROVAL_NOTE) {
            return "Yes";
        }
        return "No";
    }
}
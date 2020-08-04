package samuel.practices.fourth;

public class UnderGraduateStudent extends Student{
    
    protected static final int APPROVAL_NOTE = 51;

    public String computeCourseGrade() {

        int score = 0;
        for (int i = 0; i < test.length; i++) {
            score += test[i];
        }
        double average =  score / NUM_OF_TESTS;

        if (average >= APPROVAL_NOTE) {
            return "Yes";
        }
        return "No";
    }
}
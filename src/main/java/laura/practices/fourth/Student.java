package laura.practices.fourth;

public class Student {

    private int numOfTest;
    private String name;
    private int[] tests;
    private String courseGrade;
    private int minNoteToAproval;

    public Student(final String name) {
        this.name = name;
    }

    /**
     * @return String courseGrade
     */
    public String getCourseGrade() {
        return courseGrade;
    }

    /**
     * @return String name
     */
    public String getName() {
        return name;
    }
    /**
     * @return int[] tests
     */
    public int[] getTests() {
        return tests;
    }
    /**
     * @return String courseGrade
     */
    public String courseGrade() {
        return courseGrade;
    }
     /**
     * @return int testCore
     */
    public int getTestScore(final int pos) {
        int score = 0;
        score = tests[pos];
        return score;
    }
    /**
     * @return minNoteToAproval
     */
    public int getMinNoteToAproval() {
        return minNoteToAproval;
    }
    /**
     * @param cantTest
     */
    public void setCantTest(final int cantTest) {
        this.numOfTest = cantTest;
        this.tests = new int[cantTest];
    }
    /**
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Method to setTestScore
     */
    public void setTestScore(final int grade, final int pos) {
        this.tests[pos] = grade;
    }

    /**
     * Method to Set minNoteToAproval
     */
    public void setMinNote(final int minNoteToAprovalNote) {
        this.minNoteToAproval = minNoteToAprovalNote;
    }
    /**
     * @return String computeCourseGrade
     */
    public String computeCourseGrade() {
        int score = 0;
        for (int test: tests) {
            score += test;
        }
        if (score / numOfTest >= minNoteToAproval) {
            courseGrade = "APROVED";
        } else {
            courseGrade = "REPROVED";
        }
    return courseGrade;
    }
}

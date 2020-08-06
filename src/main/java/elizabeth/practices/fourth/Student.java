package elizabeth.practices.fourth;

public abstract class Student {

    private static final int NUM_OF_TESTS = 3;
    private String name;
    private int[] tests;
    private String courseGrade;

    public Student(final String name) {
        this.name = name;
        tests = new int[NUM_OF_TESTS];
        courseGrade = "";
    }

    public Student() {
    }

    /**
     *
     * @return String getCourseGrade
     */
    public String getCourseGrade() {
        return courseGrade;
    }

    /**
     *
     * @return String getName
     */
    public String getName() {
        return name;
    }

    /**
     *
     * Method setName
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     *
     * @return int getTestScore
     */
    public int getTestScore() {
        int score = 0;
        for (int aux:tests) {
            score = score + aux;
        }
        return (score / NUM_OF_TESTS);
    }

    /**
     *
     * Method setTestScore
     */
    public void setTestScore(final int num, final int score) {
            if (num <= NUM_OF_TESTS && score >= 0) {
                tests[num] = score;
            } else {
                throw new ArithmeticException("Negatives number is not allowed.");
            }
    }

    public abstract String computeCourseGrade();

}

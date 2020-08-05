package angela.practices.fourth;

public abstract class Student {
    //public static int NUM_OF_STUDENTS;
    private String name;
    private static final int CANT_TESTS = 3;
    private int[] tests;
    private String courseGrade;
    private int testScore;

    public Student() {
        //NUM_OF_STUDENTS++;
    }

    public Student(final String name) {
        this.name = name;
        //NUM_OF_STUDENTS++;
        tests = new int[CANT_TESTS];
    }

    /**
     *
     * @return course grade
     */
    public String getCourseGrade() {
        return  courseGrade;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     *
     * @return test score
     */
    public int getTestScore() {
        int sum = 0;
        for (int test: tests) {
            sum += test;
        }
        return (int) (sum / CANT_TESTS);
    }

    /**
     *
     * @param testScore
     */
    public void setTestScore(final int testScore) {
        this.testScore = testScore;
    }

    /**
     *
     * @param tests
     */
    public void addTest(final int[] tests) {
        this.tests = tests;
    }

    public abstract String computeCourseGrade();
}


package julia.practices.fourth;
public abstract class Student {
    public static final int NUM_OF_TEST = 3;
    private String name;
    private int[] test;
    private String courseGrade;

    public Student() {
    }
    public Student(final String nam) {
        name = nam;
        courseGrade = "reprobate";
        test = new int[NUM_OF_TEST];
    }

    /**
     *
     * @return string name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     *
     * @return array int
     */
    public int[] getTest() {
        return test;
    }

    /**
     *
     * @param
     */
    public void setTest(final int[] test) {
        this.test = test;
    }

    /**
     *
     * @return string coursegrade
     */
    public String getCourseGrade() {
        return courseGrade;
    }

    /**
     *
     * @param
     */
    public void setCourseGrade(final String courseGrade) {
        this.courseGrade = courseGrade;
    }

    /**
     *
     * @return double promtest score
     */
    public double getPromTestScore() {
        double res = 0;
        for (int tests: test) {
            res += tests;
        }
        return res;
    }

    /**
     *
     *@param
     */
    public void addScore(final int[] scores) {
        test = scores;
    }

    public abstract String computeCourseGrade();
}

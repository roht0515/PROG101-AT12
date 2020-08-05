package julia.practices.fourth;
public abstract class Student {
    public static final int NUM_OF_TEST = 3;
    private String name;
    private int[] tests;
    private String courseGrade;

    public Student() {
    }
    public Student(final String nam) {
        name = nam;
        courseGrade = "reprobate";
        tests = new int[NUM_OF_TEST];
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
        return tests;
    }

    /**
     *
     * @param
     */
    public void setTest(final int[] test) {
        tests = test;
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
    public int getPromTestScore() {
        int  res = 0;
        for (int test: tests) {
            res += test;
        }
        res = res / NUM_OF_TEST;
        return (int) res;
    }

    /**
     *
     *@param
     */

    public abstract String computeCourseGrade();
}

package samuel.practices.fourth;
public class Student {

    public static final int NUM_OF_TESTS = 3;
    private String name;
    private int[] test;
    private String courseGrade;

    public Student() {
        test = new int[NUM_OF_TESTS];
    }

    public Student(final String name) {
        this.name = name;
        test = new int[NUM_OF_TESTS];
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
     * @return String name
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @return int getTestScore
     */
    public int getTestScore(final int testNumber) {
        return test[testNumber - 1];
    }
    /**
     *
     * setName
     */
    public void setName(final String name) {
        this.name = name;
    }
    /**
     *
     * setTestScore
     */
    public void setTestScore(final int testNumber, final int note) {
        test[testNumber - 1] = note;
    }
    /**
     *
     * @return String computeCourseGrade
     */
    public String computeCourseGrade() {
        return "";
    }
}

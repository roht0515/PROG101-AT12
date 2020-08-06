package jhordan.Practices.Fourth;

public abstract class Student {

    private String name;
    private int[] test;
    private String courseGrade;

    public Student(final String name, final int[] test) {
        this.name = name;
        this.test = test;
    }

    /**get the testScore**/
    public int getTestScore(final int[] tests) {
        int result = 0;
        for (int test : tests) {
            result = result + test;
        }
        return (int) result / tests.length;
    }
    /**get the attribute test**/
    public int[] getTest() {
        return test;
    }
    /**set the attribute test**/
    public void setTest(final int[] test) {
        this.test = test;
    }
    /**get the attribute coursegrade**/
    public String getCourseGrade() {
        return courseGrade;
    }
    /**set the attribute coursegrade**/
    public void setCourseGrade(final String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public abstract String computeCourseGrade();

}

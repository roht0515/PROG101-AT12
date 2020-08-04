package samuel.practices.fourth;

public class Student {

    public static final int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] test;
    protected String courseGrade;

    public Student() {
        test = new int[NUM_OF_TESTS];
    }

    public Student(final String name) {
        this.name = name;
        test = new int[NUM_OF_TESTS];
    }

    public String getCourseGrade(){
        return courseGrade;
    }

    public String getName(){
        return name;
    }

    public int getTestScore(final int testNumber) {
        return test[testNumber - 1];
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setTestScore(final int testNumber, final int note) {
        test[testNumber - 1] = note;
    }

    public String computeCourseGrade() {
        return "";
    }
}
package student;

public class Student {
    static final int NUMBER_OF_TESTS = 3;
    private String name;
    private int[] test;
    private String courseGrade;
    public Student() {
        this.test = new int[NUMBER_OF_TESTS];
        this.name = "";
    }
    public Student(final String name) {
        this();
        this.name = name;
    }

    /**
    @return name
    **/
    public String getName() {
        return this.name;
    }

    /**
    @return courseGrade
    **/
    public String getCourseGrade() {
        return this.courseGrade;
    }

    /**
    @set courseGrade
    **/
    public void setCourseGrade(final String mark) {
        this.courseGrade = mark;
    }

    /**
    @set grades of tests
    **/
    public void gradeUp(final int[] notes) {
        test[0] = notes[0];
        test[1] = notes[1];
        test[2] = notes[2];
    }

    /**
    @return grade computed
    **/
    public String computeCourseGrade() {
        int sum = 0;
        int avg = 0;
        for (int points : this.test) {
            sum += points;
        }
        avg = sum / NUMBER_OF_TESTS;
        return avg + "";
    }
}

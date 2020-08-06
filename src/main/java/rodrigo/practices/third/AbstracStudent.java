package rodrigo.practices.third;
public abstract  class AbstracStudent {
    private final int NUM_OF_STUDENTS = 3;
    protected String name;
    protected int [] test;
    protected String courseGrade;

    /** Every figure has a color */
    AbstracStudent() {
        test = new int[3];
    }
    AbstracStudent(String name) {
        this.name =  name;
        test =  new int[NUM_OF_STUDENTS];
    }

    public String getCourseGrade() {
        return this.courseGrade;
    }

    public String getName() {
        return this.name;
    }

    public int getTestScore() {
        int score = 0;
        for (int i = 0;  i < this.test.length; i++) {
            score += this.test[i];
        }
        return score;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setTestScore(final int[] tests) {
        for (int i = 0; i < this.test.length; i++) {
            this.test[i] = tests[i];
        }

    }
    public abstract String computeCourseGrade();

}

package rodrigo.practices.third;
public abstract  class AbstracStudent {
    public int NUM_OF_STUDENTS;
    protected String name;
    protected int [] test;
    protected String courseGrade;

    /** Every figure has a color */
    AbstracStudent() {
        test =  new int[3];
    }
    AbstracStudent(String name) {
        this.name =  name;
        test =  new int[3];
    }

    /**
     *
     * @return Grade
     */
    public String getCourseGrade () {
        return this.courseGrade;
    }

    /**
     *
     * @return Name
     */
    public String getName () {
        return this.name;
    }

    /**
     *
     * @return TotalScore
     */
    public int getTestScore () {
        int score = 0;
        for (int i = 0 ;  i < this.test.length; i++) {
            score += this.test[i];
        }
        return score;
    }

    /**
     *
     * set Name
     */
    public void setName (String name) {
        this.name = name;
    }

    /**
     *
     * Set Scores
     */
    public void setTestScore (int [] tests) {
        for (int i = 0 ;  i < this.test.length; i++) {
            this.test[i] = tests[i];
        }

    }
    /**
     *
     * Show final result
     */
    public abstract String computeCourseGrade();

}

package jhordan.Practices.Fourth;

 class UnderGraduatedStudent extends Student {
    private static final int MINIMUM_SCORE_TO_APPROBE = 51;

    UnderGraduatedStudent(final String name, final int[] test) {
        super(name, test);
    }

     @Override
     public String computeCourseGrade() {
        String coursegrade = "reprobated";
        if (getTestScore(getTest()) >= MINIMUM_SCORE_TO_APPROBE) {
           coursegrade = "approved";
        }
        return coursegrade;
     }
 }

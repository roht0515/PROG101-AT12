package julia.practices.fourth;

public class GraduateStudent extends Student {

    public static final int MINIMUM_SCORE = 71;
    public GraduateStudent(final String name) {
        super(name);
    }

    /**
     * @verride
     **/
    public String computeCourseGrade() {
        String res = "reprobate";
        if (getPromTestScore() >= MINIMUM_SCORE) {
            res = "approved";
        }
        return res;
    }
}

package julia.practices.fourth;
public class UnderGraduateStudent  extends  Student {
    public static final int MINIMUM_SCORE = 51;

    public UnderGraduateStudent(final String name) {
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

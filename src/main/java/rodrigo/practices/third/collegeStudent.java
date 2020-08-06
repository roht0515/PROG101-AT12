package rodrigo.practices.third;
public class CollegeStudent extends AbstracStudent {
    private final int CANT_OF_STUDENTS = 3;
    private final int APPROVAL_SCORE = 51;
    CollegeStudent() { }
    CollegeStudent(final String name) {
    super.name = name;
    }

    public String computeCourseGrade() {
        int totalScore = 0;
        for (int i = 0; i < super.test.length; i++) {
            totalScore += super.test[i];
        }
        totalScore /= CANT_OF_STUDENTS;
        if (totalScore >= APPROVAL_SCORE) {
            return super.courseGrade = "Aprobado";
        }
        return  super.courseGrade = "Reprobado";
    }
}

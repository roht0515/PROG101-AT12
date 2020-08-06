package rodrigo.practices.third;
public class GraduateStudent extends AbstracStudent {
    private final int CANT_OF_STUDENTS = 3;
    private final int APPROVAL_SCORE = 71;
    GraduateStudent() { }

    GraduateStudent(String name) {
        super.name = name;
    }

    public String computeCourseGrade() {
        int totalScore = 0;
        for (int i = 0; i < super.test.length; i++) {
            totalScore += super.test[i];
        }
        totalScore /= CANT_OF_STUDENTS;
        if (totalScore >= APPROVAL_SCORE) {
            super.courseGrade = "Aprobado";
            return "Aprobado";
        }
        super.courseGrade = "Reprobado";
        return "Reprobado";
    }
}

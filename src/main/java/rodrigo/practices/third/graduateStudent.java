package rodrigo.practices.third;
public class graduateStudent extends AbstracStudent {

    graduateStudent () { }

    graduateStudent (String name) {
        super.name = name;
    }

    public String computeCourseGrade(){
        int totalScore = 0;
        for( int i = 0; i < super.test.length; i++) {
            totalScore+= super.test[i];
        }
        totalScore /= 3;
        if(totalScore >= 71) {
            super.courseGrade = "Aprobado";
            return "Aprobado";
        }
        super.courseGrade = "Reprobado";
        return "Reprobado";
    }
}

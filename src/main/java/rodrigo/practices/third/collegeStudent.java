package rodrigo.practices.third;
public class collegeStudent extends AbstracStudent{

    collegeStudent () { }
    collegeStudent (String name) {
    super.name = name;
    }

    /**
     *
     * @return final result
     */
    public String computeCourseGrade(){
        int totalScore = 0;
        for( int i = 0; i < super.test.length; i++) {
            totalScore+= super.test[i];
        }
        totalScore /= 3;
        if(totalScore >= 51) {
            return super.courseGrade = "Aprobado";
        }
        return  super.courseGrade = "Reprobado";
    }
}

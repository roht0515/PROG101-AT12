package elizabeth.practices.fourth;

public abstract class Student {

    private static final int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] tests;
    protected String CourseGrade;

    public Student(){

    }

    public Student(final String name){
        this.name = name;
        tests = new int[NUM_OF_TESTS];
    }

    public String getCourseGrade() {
        return CourseGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getTestScore(){
        int score = 0;
        for (int aux:tests) {
            score = score + aux;
        }
        return (score/NUM_OF_TESTS);
    }

    public void setTestScore(){

    }

    public abstract String computeCourseGrade();

}

package laura.practices.fourth;

public class UnderGraduate extends Student {

    private static final int MIN_NOTE_TO_APROVAL = 51;
    private static final int CANT_TEST = 3;

    public UnderGraduate(final String name) {
        super(name);
        super.setCantTest(CANT_TEST);
        super.setMinNote(MIN_NOTE_TO_APROVAL);
    }
}

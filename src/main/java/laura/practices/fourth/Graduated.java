package laura.practices.fourth;

public class Graduated extends Student {

    private static final int MIN_NOTE_TO_APROVAL = 71;
    private static final int CANT_TEST = 3;

    public Graduated(final String name) {
        super(name);
        super.setCantTest(CANT_TEST);
        super.setMinNote(MIN_NOTE_TO_APROVAL);
    }
}

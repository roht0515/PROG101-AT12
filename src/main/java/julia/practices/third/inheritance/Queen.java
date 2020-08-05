package julia.practices.third.inheritance;

public class Queen extends Figure {
    public Queen(final int color) {
        super(color);
    }

    /**
     *
     * @param
     */
    public void whoAmI() {
        super.whoAmI();
        System.out.println("inheritance.Queen");
    }

    /**
     * Not needed for this exercise.
     */
    public boolean move(final Position origin, final Position destination) {
        // This is not correct, but we will not need it for this exercise
        return true;
    }
} // inheritance.Queen

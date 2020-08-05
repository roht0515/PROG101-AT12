package rodrigo.practices.third;
public class Queen extends Figure {
    public Queen(int color) {
        super(color);
    }

    /**
     *
     * @return who is
     */
    public String whoAmI() {
        String type = super.whoAmI();
        return type + " " + "Queen";
    }

    /**
     * Not needed for this exercise.
     */
    public boolean move(Position origin, Position destination) {
        // This is not correct, but we will not need it for this exercise
        return true;
    }
}

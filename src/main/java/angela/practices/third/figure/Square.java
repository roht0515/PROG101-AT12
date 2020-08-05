package angela.practices.third.figure;

public class Square extends Rectangle {
    private int side;

    public Square(final int side) {
        super(side, side);
        this.setSideA(side);
        this.setSideB(side);
        this.setType("Square");
    }

    /**
     *
     * @return area
     */
    public double area() {
        return side * side;
    }
}

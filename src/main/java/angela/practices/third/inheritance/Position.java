package angela.practices.third.inheritance;

/** Position -row and column- of an object */
public class Position {
    private int row, column;

    /** Initialization of the default state object (to 0) */
    Position() {
        row = 0;
        column = 0;
    }

    /** Initialization according to a coordinate */
    public Position(final int row, final int column) {
        this.row = row;
        this.column = column;
    }

    /**
     *
     * @return row
     */
    public int getRow() {
        return this.row;
    }

    /**
     *
     * @return column
     */
    public int getColumn() {
        return this.column;
    }

    /**
     *
     * @param row
     */
    public void setRaw(final int row) {
        this.row = row;
    }

    /**
     *
     * @param column
     */
    public void setColumn(final int column) {
        this.column = column;
    }

} // Position

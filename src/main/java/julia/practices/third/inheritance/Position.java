package julia.practices.third.inheritance;

/** inheritance.Position -row and column- of an object */
class Position {
    private int row, column;

    /** Initialization of the default state object (to 0) */
    Position() {
        row = 0;
        column = 0;
    }

    /** Initialization according to a coordinate */
    Position(final int rows, final int columns) {
        this.row = rows;
        this.column = columns;
    }

    /*
     *
     * @return int row
     */
    public int getRow() {
        return this.row;
    }

    /*
     *
     * @Return int column
     */
    public int getColumn() {
        return this.column;
    }

    /*
     *
     * @param
     */
    public void setRaw(final int row) {
        this.row = row;
    }

    /*
     *
     * @param
     */
    public void setColumn(final int column) {
        this.column = column;
    }

} // inheritance.Position

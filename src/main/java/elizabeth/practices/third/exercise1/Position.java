package elizabeth.practices.third.exercise1;

/** Position -row and column- of an object */
public class Position {
    private int row, column;

    /** Initialization of the default state object (to 0) */
    Position() {
        row = 0;
        column = 0;
    }

    /** Initialization according to a coordinate */
    Position(final int row, final int column) {
        this.row = row;
        this.column = column;
    }

    /**
     *@return int getRow
     */
    public int getRow() {
        return this.row;
    }

    /**
     *@return int getColumn
     */
    public int getColumn() {
        return this.column;
    }

    /**
     *Method void setRaw
     */
    public void setRaw(final int row) {
        this.row = row;
    }

    /**
     *Method void setRaw
     */
    public void setColumn(final int column) {
        this.column = column;
    }

} // Position


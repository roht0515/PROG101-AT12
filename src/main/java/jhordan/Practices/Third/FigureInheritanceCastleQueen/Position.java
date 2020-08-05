package jhordan.Practices.Third.FigureInheritanceCastleQueen;

/** Position -row and column- of an object */
  class Position {
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

  public int getRow() {
    return this.row;
  }

  public int getColumn() {
    return this.column;
  }

  public void setRow(final int row) {
    this.row = row;
  }

  public void setColumn(final int column) {
    this.column = column;
  }

} // Position

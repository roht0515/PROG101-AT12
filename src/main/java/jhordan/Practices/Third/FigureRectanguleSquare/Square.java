package jhordan.Practices.Third.FigureRectanguleSquare;

public class Square extends Rectangule {
    private int side;

    public Square(final String tag, final int side) {
        super(tag);
        this.side = side;
    }
    /**return the area of the square**/
    public double area() {
        return side * side;
    }
    /** return an String with th tupe of figure**/
    @Override
    public String getFigureType() {
        return "square";
    }

    /**draw the figure*/
    @Override
    public String drawTxt() {
        String figureDraw = "";
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                figureDraw = figureDraw + "*";
            }
            figureDraw = figureDraw + "\n";
        }
        return figureDraw;
    }
   /**getter  of attribute side**/
    public int getSide() {
        return side;
    }
    /**setter of attribute side**/
    public void setSide(final int side) {
        this.side = side;
    }


}

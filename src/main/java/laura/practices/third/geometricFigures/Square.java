package laura.practices.third.geometricFigures;

public class Square extends Rectangle{
    public int size;
    public static final String LABEL = "Square";

    public Square (final int color) {
        super(color);
    }

    public Square(final int color, final int height, final int width) {
        super(color);
        this.size = height;
        this.size = width;
    }
    /**
     * @return String FigureType
     */
    public String getFigureType(){
        return "Square";
    }
    /**
     * Method to get String label
     */
    public String getLabel() {
        return LABEL;
    }
    /**
     * @return double area
     */
    public double area(){
        return (double) (size*size);
    }
}
package laura.practices.third.geometricFigures;

public class Rectangle extends GeometricFigure{

    public String tag = "";
    public static final String LABEL = "Rectangle";
    public int height;
    public int width;

    public Rectangle(final int color) {
        super(color);
    }

    public Rectangle(final int color, final String tag) {
        super(color, tag);
    }

    public Rectangle(final int color, final int height, final int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    /**
     * @return int height
     */
    public int getHeight() {
        return height;
    }
    /**
     * @return int width
     */
    public int getWidth() {
        return width;
    }
    /**
     * Method to change height
     */
    public void setHeight(final int height) {
        this.height = height;
    }
    /**
     * Method to change width
     */
    public void setWidth(final int width) {
        this.width = width;
    }
    /**
     * 
     */
    public String getFigureType(){
        return "Rectangle";
    }
    /**
     * Method to get String label
     */
    public String getLabel() {
        return LABEL;
    }
    /**
     * 
     */
    public double area(){
        return (double) (height*width);
    }

    /**
     * 
     */
    public void drawTxt(){
        String cad = "";
        for(int a = 0; a < height; a++) {
            for (int i = 0; i < width; i++) {
                cad += "*";
            }
            cad = cad + "\n";
        }
        System.out.println(cad);
    }
}
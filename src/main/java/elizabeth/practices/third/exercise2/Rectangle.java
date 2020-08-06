package elizabeth.practices.third.exercise2;

public class Rectangle extends GeometricFigure {
    private int height;
    private int width;
    private String figureType;

    public Rectangle(final String description, final String figureType, final int height, final int width) {
        super(description);
        this.height = height;
        this.width = width;
        this.figureType = figureType;
    }

    /**
     *@return int getHeight
     */
    public int getHeight() {
        return height;
    }

    /**
     *@return int getHeight
     */
    public int getWidth() {
        return width;
    }

    /**
     *@Method void setHeight
     */
    public void setHeight(final int height) {
        this.height = height;
    }

    /**
     *@Method void setWidth
     */
    public void setWidth(final int width) {
        this.width = width;
    }

    /**
     *@return double area
     */
    @Override
    public double area() {
        return (height * width);
    }

    /**
     * @Method void drawTxt
     */
    @Override
    public void drawTxt() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    /**
     * @return String getFigureType
     */
    @Override
    public String getFigureType() {
        return figureType;
    }
}

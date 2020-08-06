package laura.practices.third.geometricFigures;

public class Rectangle extends GeometricFigure {

    private static final String LABEL = "Rectangle";
    private int height;
    private int width;

    public Rectangle(final String tag, final int height, final int width) {
        super(tag);
        this.label = LABEL;
        this.height = height;
        this.width = width;
        this.area = height * width;
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
     *
     */
    public void drawTxt() {
        String cad = "";
        for (int a = 0; a < height; a++) {
            for (int i = 0; i < width; i++) {
                cad += "*";
            }
            cad = cad + "\n";
        }
        System.out.print(cad);
    }
}

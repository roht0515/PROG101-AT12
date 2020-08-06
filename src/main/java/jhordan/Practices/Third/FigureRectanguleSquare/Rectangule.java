package jhordan.Practices.Third.FigureRectanguleSquare;

public class Rectangule extends GeometricFigure {
     private int base, height;
     private String figure;
    public Rectangule(final String tag, final int base, final int height) {
        super(tag);
        this.base = base;
        this.height = height;
    }
    /**return the tyoe of figure**/
    public String getFigureType() {
        return "Rectangule";
    }
    /**return the area**/
    public double area() {
        return base * height;
    }
    /** draw the figure then print it**/
    public void drawTxt() {
        figure = "";
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getBase(); j++) {
                figure = figure + "*";
            }
            figure = figure + "\n";
        }
        System.out.println(figure);
    }
   /**return a string with the figure drawed in case of test the function**/
    public String textdrawed() {
        drawTxt();
        return figure;
    }
   /** return the base of the figure**/
    public int getBase() {
        return base;
    }
    /**return the height of the figure**/
    public int getHeight() {
        return height;
    }
}

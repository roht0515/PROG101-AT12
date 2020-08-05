package jhordan.Practices.Third.FigureRectanguleSquare;

public class Rectangule extends GeometricFigure {
    private int base, height;


    Rectangule(final String tag) {
        super(tag);
    }


    public Rectangule(final String tag, final int base, final int height) {
      super(tag);
      this.base = base;
      this.height = height;
    }
    /**return the description of the figure**/
    @Override
    public String printDescription() {
        return "Tag: " + getTag() + "\n"
                + "Figure Type: " + getFigureType() + "\n"
                + "Area: " + area();
    }
    /**returns the type of figure**/
    public String getFigureType() {
        return "Rectangule";
    }
    /** return th area*/
    public double area() {
        return (double) base * height;
    }
    /**returns and String with the figure **/
    public String drawTxt() {
       String figureDraw = "";

       for (int i = 0; i < height; i++) {

           for (int j = 0; j < base; j++) {
               figureDraw = figureDraw + "*";
           }
           figureDraw = figureDraw + "\n";
       }

     return figureDraw;
    }
    /**getter of attribute base **/
    public int getBase() {
        return base;
    }
    /**setter of attribute base **/
    public void setBase(final int base) {
        this.base = base;
    }
    /**getter of attribute height **/
    public int getHeight() {
        return height;
    }
    /**getter of attribute height **/
    public void setHeight(final int height) {
        this.height = height;
    }
}

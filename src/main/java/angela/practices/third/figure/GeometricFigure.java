package angela.practices.third.figure;

import angela.practices.third.inheritance.Figure;
import angela.practices.third.inheritance.Position;

public abstract class GeometricFigure extends Figure {
    protected String tag;
    protected String description;
    protected String type;
    protected double area;

    public  GeometricFigure(int color){
        super(color);
    }

    public GeometricFigure(String type) {
        super(1);
        this.type = type;
    }
    public final void setDescription(String description){
        this.description = description;
    }
    public final String getDescription(){
        return description;
    }

    public final void setType(String type){
        this.description = description;
    }
    public final String getType(){
        return description;
    }
    /**
     * Castle movement We are supposing an empty board
     */
    public boolean move(Position origin, Position destination){
        return true;
    }
    public final void printDescription() {
        System.out.println("Tag : "+tag+"\n"+"Figure type : "+type+"\n"+"Area : "+area);
    }
    public String getTag(){
        return tag;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getArea() {
        return area;
    }
}

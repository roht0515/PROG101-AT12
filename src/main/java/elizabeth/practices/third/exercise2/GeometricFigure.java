package elizabeth.practices.third.exercise2;
import elizabeth.practices.third.exercise1.Figure;
import elizabeth.practices.third.exercise1.Position;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


abstract class GeometricFigure extends Figure {
    protected String description;
    protected String tag;


    public GeometricFigure(String description) {
        this.description = description;
        tag = "";
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        this.description = description;
    }

    public boolean move(Position origin, Position destination){
        return true;
    }

    public abstract String getTag();
    public abstract String getFigureType();
    public abstract double area();
    public abstract void drawTxt();

    public final void printDescription(){
        System.out.println("Tag :"+getTag());
        System.out.println("Figure Type:"+getFigureType());
        System.out.println("Area :"+area());

    }
}

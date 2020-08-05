package figures;

import java.io.BufferedReader;
import java.io.IOException;


public class Rectangle extends GeometricFigure {
    private int base;
    private int height;

    /**
    @create a new Rectangle contructor;
    **/
    public Rectangle(final int base, final int height) {
        super.setTag("");
        super.setFigureType("Rectangle");
        this.base = base;
        this.height = height;
        super.setArea(this.base * this.height);
    }
    /**
    @set base;
    **/
    public void setBase(final int base) {
        this.base = base;
    }

    /**
    @set height;
    **/
    public void setHeight(final int height) {
        this.height = height;
    }

    /**
    @return base;
    **/
    public int getBase() {
        return this.base;
    }

    /**
    @return heaight;
    **/
    public int getHeight() {
        return this.height;
    }


    /**
    @return type;
    **/
    public String getFigureType() {
        return super.getFigureType();
    }

    /**
    @return area;
    **/
    public double area() {
        return super.area();
    }


    /**
    @print a description of the object;
    **/
    public void drawTxt() {
        for (int index = 0; index < this.height; index++) {
            for (int jndex = 0; jndex < this.base; jndex++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
    @draw an object;
    **/
    public void readFigureData(final BufferedReader reader) throws IOException {
        String data = reader.readLine();
        if (data.length() == 1) {
            setHeight(Integer.parseInt(data));
            setBase(Integer.parseInt(data));
        } else {
            setHeight(Integer.parseInt(data.charAt(0) + ""));
            setHeight(Integer.parseInt(data.charAt(2) + ""));
        }
    }
}

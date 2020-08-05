package elizabeth.practices.third.exercise2;

import elizabeth.practices.third.exercise1.Figure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle extends GeometricFigure{
    private int height;
    private int width;

    public Rectangle(String description, int height, int width) {
        super(description);
        this.height = height;
        this.width = width;
    }
    public Rectangle(String description) {
        super(description);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String getTag() {
        return tag + " - " +height+", "+width;
    }

    @Override
    public String getFigureType() {
        return description;
    }

    @Override
    public double area() {
        return (height * width);
    }

    @Override
    public void drawTxt() {
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= width ; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

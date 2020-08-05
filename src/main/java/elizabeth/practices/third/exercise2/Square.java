package elizabeth.practices.third.exercise2;

import elizabeth.practices.third.exercise1.Figure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square extends Rectangle{
    private int side;
    public Square(String description,int side) {
        super(description);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (side * side);
    }

    @Override
    public void drawTxt() {
        for (int i = 1; i <= side ; i++) {
            for (int j = 1; j <= side ; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

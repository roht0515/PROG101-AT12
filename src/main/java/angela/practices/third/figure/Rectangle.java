package angela.practices.third.figure;

import java.io.BufferedReader;

public class Rectangle extends GeometricFigure {
    private int base, height;

    public Rectangle(final int base, final int height) {
        this(base, height, "Rectangle");
    }
    public Rectangle(final int base, final int height, final String tag) {
        super(tag);
        super.setFigureType("Rectangle");
        this.base = base;
        this.height = height;
    }

    /**
     *
     * @return area
     */
    public double area() {
        super.setArea(base * height);
        return base * height;
    }

    /**
     *
     * @return a sideA of rectangle
     */
    public int getBase() {
        return base;
    }

    /**
     *
     * @return a sideB of rectangle
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * draw a rectangle in the console
     */
    public void drawTxt() {
        String result = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                result += "* ";
            }
            System.out.println(result);
            result = "";
        }
    }

    /**
     *
     * @param text with the user entry
     * @return a Rectangle if the user entry was correct
     */
    public static Rectangle readFigureData(final BufferedReader text) {
        Rectangle rectangle = null;
        int base = 0;
        int height = 0;
        String tag = "";
        try {
            System.out.println("Insert a base:");
            base = Integer.parseInt(text.readLine());
            System.out.println("Insert a height:");
            height = Integer.parseInt(text.readLine());
            System.out.println("Insert a tag:");
            tag = text.readLine();
            if (base > 0 && height > 0 && !tag.equals("")) {
                rectangle = new Rectangle(base, height, tag);
            } else {
                System.out.println("Insert a valid values");
            }
        } catch (Exception e) {
            System.out.println("Entry invalid: " + e.getMessage());
        }
        return rectangle;
    }
}

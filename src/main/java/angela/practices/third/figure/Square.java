package angela.practices.third.figure;

import java.io.BufferedReader;

public class Square extends Rectangle {
    private int side;

    public Square(final int side) {
        this(side, "Square");
    }

    public Square(final int side, final String tag) {
        super(side, side, tag);
        setFigureType("Square");
    }

    /**
     *
     * @param text with the user entry
     * @return a Square if the user entry was correct
     */
    public static Square readFigureData(final BufferedReader text) {
        Square square = null;
        int side = 0;
        String tag = "";
        try {
            System.out.println("Insert a side:");
            side = Integer.parseInt(text.readLine());
            System.out.println("Insert a tag:");
            tag = text.readLine();
            if (side > 0 && !tag.equals("")) {
                square = new Square(side, tag);
            } else {
                System.out.println("Insert a valid values");
            }
        } catch (Exception e) {
            System.out.println("Entry invalid: " + e.getMessage());
        }
        return square;
    }
}


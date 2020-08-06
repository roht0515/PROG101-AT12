package jhordan.Practices.Third.FigureInheritanceCastleQueen;

import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class FigureTest {

    @Test
    public void testGetQuantityCastleAndQueen() {
        FigureList figureList= new FigureList();
        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(new Castle(1));
        figures.add(new Castle(0));
        figures.add(new Castle(1));
        figures.add(new Castle(1));
        figures.add(new Queen(0));
        String expected = "Quantity of castles: 4 Quantity of queens: 1";
        String actual = figureList.getQuantityQueensAndCastle(figures);
        assertEquals(expected,actual);
    }

}

package laura.practices.third;

import org.junit.Test;

import jdk.jfr.Timestamp;

import static org.junit.Assert.*;
  
public class ChessTest {
    @Test
    public void testWhoAmICastle() {
        Castle castle = new Castle(0);
        String expected = "Castle";
        String actual = castle.whoAmI();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testWhoAmIQueen() {
        Queen queen = new Queen(0);
        String expected = "Queen";
        String actual = queen.whoAmI();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testMoveQueen(){
        Position origin = new Position(0, 0);
        Position destination = new Position(1, 1);
        Queen queen = new Queen(0);
        boolean expected = true;
        boolean actual = queen.move(origin, destination);
        assertEquals (expected, true);
    }
}
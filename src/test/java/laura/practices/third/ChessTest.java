package laura.practices.third;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChessTest {

    @Test
    public void testMoveQueen(){
        Position origin = new Position(0, 0);
        Position destination = new Position(1, 1);
        Queen queen = new Queen(0);
        boolean expected = true;
        boolean actual = queen.move(origin, destination);
        assertEquals (expected, actual);
    }
}
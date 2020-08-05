package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class inheritanceTest {
	@Test
    public void testCreateTwoQueensAndFourCastleClasses(){
        Figure[] figures = new  Figure[6];
        figures [0] = new Queen (0);
        figures [1] = new Castle (0);
        figures [2] = new Castle (1);
        figures [3] = new Queen (1);
        figures [4] = new Castle (1);
        figures [5] = new Castle (0);
        System.out.println();
        for(Figure figure : figures) {
            figure.whoAmI();
        }
        assertNotNull(figures);
    }
}
package elizabeth.practices.second;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductTest {
    @Test
    public void testGetTotalCostProduct() {
        Product milk = new Product("milk", 10, 2, "lt");
        milk.setQuantityProm(5);
        milk.verifyPromotion();
        int expected = 20;
        int actual = milk.getTotalCostProduct();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTotalCostProductWithDescount() {
        Product milk = new Product("milk", 10, 5, "lt");
        milk.setQuantityProm(5);
        milk.verifyPromotion();
        int expected = 45;
        int actual = milk.getTotalCostProduct();
        assertEquals(expected, actual);
    }
}
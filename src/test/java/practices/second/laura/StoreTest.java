package practices.second.laura;

import org.junit.Test;
import static org.junit.Assert.*;

public class StoreTest {

    @Test
    public void testTotalCostNoProductAdded() {
        Store store = new Store();
        int expected = 0;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        store.buy(new Product("milk", 10, 1));
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithThreeProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        store.buy(new Product("milk", 10, 1));
        store.buy(new Product("cheese", 15, 1));
        int expected = 26;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithTwoSameProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        store.buy(new Product("bread", 1, 1));
        int expected = 2;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithNProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        store.buy(new Product("bread", 1, 1));
        store.buy(new Product("milk", 10, 1));
        store.buy(new Product("cheese", 15, 1));
        int expected = 27;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        String expected = "Cant Product Price Total" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "1-    bread -   1 1" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "Total             1";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        store.buy(new Product("milk", 10, 1));
        String expected = "Cant Product Price Total" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "1-    bread -   1 1" + "\n" +
                          "1-    milk -   10 10" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "Total             11";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
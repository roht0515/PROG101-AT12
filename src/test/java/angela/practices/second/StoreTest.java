package angela.practices.second;

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
        store.buy(new Product("bread", 1));
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1));
        store.buy(new Product("milk", 10));
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    /*@Test
    public void testInvoiceDetailWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1));
        String expected = "**************************************";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }*/

    @Test
    public void testInvoiceDetailWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product(3, "Bread", 1));
        store.buy(new Product(2, "Milk", 10));
        String expected = "Cant\t\tProduct\t\tPrice\tTotal\n" +
                "--------------------------------------------------------\n" +
                "3      -    Bread   -   $1      $3\n" +
                "2      -    Milk    -   $10     $20\n" +
                "--------------------------------------------------------\n" +
                "Total                           $23";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithThreeProductsAndUnits() {
        Store store = new Store();
        store.buy(new Product(3, "Bread", 1, "u"));
        store.buy(new Product(2, "Milk", 10, "lt"));
        store.buy(new Product(5, "Rice", 5, "kg"));
        String expected = "Cant\t\tProduct\t\tPrice\tTotal\n" +
                "--------------------------------------------------------\n" +
                "3  u   -    Bread   -   $1      $3\n" +
                "2  lt  -    Milk    -   $10     $20\n" +
                "5  kg  -    Rice    -   $5      $25\n" +
                "--------------------------------------------------------\n" +
                "Total                           $48";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithFourProductsWithPromos() {
        Store store = new Store();
        store.buy(new Product(10, "Bread", 1, "u", true, 9));
        store.buy(new Product(5, "Milk", 10, "lt", true, 45));
        store.buy(new Product(10, "Oil", 10, "lt", true, 90));
        store.buy(new Product(20, "Rice", 5, "kg", true, 90));
        String expected = "Cant\t\tProduct\t\tPrice\tTotal\tDesc\n" +
                "--------------------------------------------------------\n" +
                "10 u   -    Bread   -   $1      $9     10%\n" +
                "5  lt  -    Milk    -   $10     $45    10%\n" +
                "10 lt  -    Oil     -   $10     $90    10%\n" +
                "20 kg  -    Rice    -   $5      $90    10%\n" +
                "--------------------------------------------------------\n" +
                "Total                           $234";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
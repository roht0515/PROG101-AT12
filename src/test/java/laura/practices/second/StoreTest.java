package laura.practices.second;

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
    public void testTotalInvoiceWithTwoSameProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        store.buy(new Product("bread", 1, 1));
        int expected = 2;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithNProducts() {
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
    public void testTotalInvoiceWithOneProductInPromo() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 10));
        int expected = 9;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProductsInPromo() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 10));
        store.buy(new Product("oil", 10, 10));
        int expected = 99;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProductsOneInPromo() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 10));
        store.buy(new Product("jelly", 1, 25));
        int expected = 34;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        String expected = "Cant Product Price Total" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "1-u    bread -   1 1" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "Total               1";
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
                          "1-u    bread -   1 1" + "\n" +
                          "1-lt    milk -   10 10" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "Total               11";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithNProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1));
        store.buy(new Product("milk", 10, 1));
        store.buy(new Product("rice", 5, 5));
        String expected = "Cant Product Price Total" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "1-u    bread -   1 1" + "\n" +
                          "1-lt    milk -   10 10" + "\n" +
                          "5-kg    rice -   5 25" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "Total               36";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithOneProductInPromo() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 10));
        String expected = "Cant Product Price Total" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "10-u    bread -   1 9" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "Total               9";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithTwoProductsInPromo() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 10));
        store.buy(new Product("milk", 10, 5));
        String expected = "Cant Product Price Total" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "10-u    bread -   1 9" + "\n" +
                          "5-lt    milk -   10 45" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "Total               54";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithNProductsInPromo() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 10));
        store.buy(new Product("milk", 10, 5));
        store.buy(new Product("rice", 5, 20));
        String expected = "Cant Product Price Total" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "10-u    bread -   1 9" + "\n" +
                          "5-lt    milk -   10 45" + "\n" +
                          "20-kg    rice -   5 90" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "Total               144";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithTwoProductsOneInPromo() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 10));
        store.buy(new Product("jelly", 25, 1));
        String expected = "Cant Product Price Total" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "10-u    bread -   1 9" + "\n" +
                          "1-u    jelly -   25 25" + "\n" +
                          "--------------------------------------------------------" + "\n" +
                          "Total               34";
        String actual = store.createInvoice().getDetail();
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
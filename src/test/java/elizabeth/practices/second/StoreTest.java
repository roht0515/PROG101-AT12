package elizabeth.practices.second;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

    @Test
    public void testInvoiceDetailWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1));
        String expected = "Cant\tProduct\t\tPrice\tTotal\n"
                + "-------------------------------\n"
                + "1\t\tbread\t\t1\t\t1\n"
                + "-------------------------------\n"
                + "Total\t\t\t\t\t\t1";
        String actual = store.createInvoice().getDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailWithTwoProducts() {
        Store store = new Store();
        Product bread = new Product("bread", 1);
        Product milk = new Product("milk", 10);
        milk.setQuantity(2);
        store.buy(bread);
        store.buy(milk);
        String expected = "Cant\tProduct\t\tPrice\tTotal\n"
                + "-------------------------------\n"
                + "1\t\tbread\t\t1\t\t1\n"
                + "2\t\tmilk\t\t10\t\t20\n"
                + "-------------------------------\n"
                + "Total\t\t\t\t\t\t21";
        String actual = store.createInvoice().getDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailCompleteWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1, "u"));
        String expected = "Cant\tProduct\t\tPrice\tTotal\n"
                + "-------------------------------\n"
                + "1 u\t\tbread\t\t$1\t\t$1\n"
                + "-------------------------------\n"
                + "Total\t\t\t\t\t\t$1";
        String actual = store.createInvoice().getDetailComplete();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailCompleteThreeTwoProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 1, "u"));
        store.buy(new Product("milk", 10, 2, "lt"));
        store.buy(new Product("rice", 5, 5, "kg"));
        String expected = "Cant\tProduct\t\tPrice\tTotal\n"
                + "-------------------------------\n"
                + "1 u\t\tbread\t\t$1\t\t$1\n"
                + "2 lt\t\tmilk\t\t$10\t\t$20\n"
                + "5 kg\t\trice\t\t$5\t\t$25\n"
                + "-------------------------------\n"
                + "Total\t\t\t\t\t\t$46";
        String actual = store.createInvoice().getDetailComplete();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailCompleteWithOneProductwithPromotion() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 10, "u"));
        String expected = "Cant\t\tProduct\t\tPrice\tCost\tDiscount Cost\n" +
                "-----------------------------------------------------\n"+
                "10 u\t\tbread\t\t$1\t\t$10\t\t$9\n"+
                "-----------------------------------------------------\n"+
                "Total\t\t\t\t\t\t\t\t\t$9";
        String actual = store.createInvoice().getDetailCompleteWithDiscount();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailCompleteWithFourProductsWithPromotion() {
        Store store = new Store();
        store.buy(new Product("bread", 1, 10, "u"));
        Product milk = new Product("milk", 10, 5, "lt");
        milk.setQuantityProm(5);
        store.buy(milk);
        store.buy(new Product("oil", 10, 10, "lt"));
        store.buy(new Product("rice", 5, 20, "kg"));
        store.buy(new Product("butter", 5, 1, "kg"));

        String expected = "Cant\t\tProduct\t\tPrice\tCost\tDiscount Cost\n"
                + "-----------------------------------------------------\n"
                + "10 u\t\tbread\t\t$1\t\t$10\t\t$9\n"
                + "5 lt\t\tmilk\t\t$10\t\t$50\t\t$45\n"
                + "10 lt\t\toil\t\t$10\t\t$100\t\t$90\n"
                + "20 kg\t\trice\t\t$5\t\t$100\t\t$90\n"
                + "1 kg\t\tbutter\t\t$5\t\t$5\t\t-\n"
                + "-----------------------------------------------------\n"
                + "Total\t\t\t\t\t\t\t\t\t$239";
        String actual = store.createInvoice().getDetailCompleteWithDiscount();
        assertEquals(expected, actual);
    }
}

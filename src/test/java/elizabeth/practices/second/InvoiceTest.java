package elizabeth.practices.second;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class InvoiceTest {
    @Test
    public void testGetTotalCost() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("bread", 1));
        products.add(new Product("milk", 10));
        Invoice invoice = new Invoice(products);
        int expected = 11;
        int actual = invoice.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailCompleteWithFourProductsWithPromotion() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("bread", 1, 10, "u"));
        Product milk = new Product("milk", 10, 5, "lt");
        milk.setQuantityProm(5);
        products.add(milk);
        products.add(new Product("oil", 10, 10, "lt"));
        products.add(new Product("rice", 5, 20, "kg"));
        products.add(new Product("butter", 5, 1, "kg"));
        Invoice invoice = new Invoice(products);

        String expected = "Cant\t\tProduct\t\tPrice\tCost\tDiscount Cost\n"
                + "-----------------------------------------------------\n"
                + "10 u\t\tbread\t\t$1\t\t$10\t\t$9\n"
                + "5 lt\t\tmilk\t\t$10\t\t$50\t\t$45\n"
                + "10 lt\t\toil\t\t$10\t\t$100\t\t$90\n"
                + "20 kg\t\trice\t\t$5\t\t$100\t\t$90\n"
                + "1 kg\t\tbutter\t\t$5\t\t$5\t\t-\n"
                + "-----------------------------------------------------\n"
                + "Total\t\t\t\t\t\t\t\t\t$239";
        String actual = invoice.getDetailCompleteWithDiscount();
        assertEquals(expected, actual);
    }
}
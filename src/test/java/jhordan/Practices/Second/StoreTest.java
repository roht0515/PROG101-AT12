package jhordan.Practices.Second;

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

    @Test
    public void testGetPriceOfEachProductAndTotal() {
        Store store = new Store();
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Milk", 10));
        String expected = "Bread - $1\n" +
                "Milk - $10\n" +
                "----------------------------\n" +
                "Total $11";
        String actual = store.createInvoice().getDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetQuantityPriceProductAndTotal() {
        Store store = new Store();
        store.buy(new Product("Bread", 1,3));
        store.buy(new Product("Milk", 10,2));
        String expected = "Cant Product Price Total\n" +
                          "--------------------------------------------------------\n" +
                          "3 - Bread - $1 $3\n" +
                          "2 - Milk - $10 $20\n" +
                          "--------------------------------------------------------\n" +
                          "Total $23";
        String actual = store.createInvoice().getDetailWithQuantity();
        assertEquals(expected, actual);
    }

   @Test
    public void testGetCompleteInvoice() {
        Store store = new Store();
        store.buy(new Product("Bread", 1,3,"Unit"));
        store.buy(new Product("Milk", 10,2,"Liters"));
        store.buy(new Product("Rice", 5,5,"Kilograms"));
        String expected = "Cant Product Price Total\n" +
                "--------------------------------------------------------\n" +
                "3 u - Bread - $1 $3\n" +
                "2 lt - Milk - $10 $20\n" +
                "5 kg - Rice - $5 $25\n" +
                "--------------------------------------------------------\n" +
                "Total $48";
        String actual =store.createInvoice().getDetailWithQuantityAndUnit() ;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCompleteInvoiceWithPromo() {
        Store store = new Store();
        store.buy(new Product("Bread", 1,10,"Unit",true));
        store.buy(new Product("Milk", 10,5,"Liters",true));
        store.buy(new Product("Oil", 10,10,"Liters",true));
        store.buy(new Product("Rice", 5,20,"Kilograms",true));
        String expected = "Cant Product Price Total Discount\n" +
                "--------------------------------------------------------\n" +
                "10 u - Bread - $1 $10 10%\n" +
                "5 lt - Milk - $10 $50 10%\n" +
                "10 lt - Oil - $10 $100 10%\n" +
                "20 kg - Rice - $5 $100 10%\n" +
                "--------------------------------------------------------\n" +
                "Total $234";
        String actual =store.createInvoice().getDetailWithQuantityAndUnitWithPromo() ;
        assertEquals(expected, actual);
    }
    @Test
    public void testGetCompleteInvoiceWithPromoLessTwoProduct() {
        Store store = new Store();
        store.buy(new Product("Bread", 1,10,"Unit"));
        store.buy(new Product("Milk", 10,5,"Liters",true));
        store.buy(new Product("Oil", 10,10,"Liters",true));
        store.buy(new Product("Rice", 5,20,"Kilograms"));
        String expected = "Cant Product Price Total Discount\n" +
                "--------------------------------------------------------\n" +
                "10 u - Bread - $1 $10\n" +
                "5 lt - Milk - $10 $50 10%\n" +
                "10 lt - Oil - $10 $100 10%\n" +
                "20 kg - Rice - $5 $100\n" +
                "--------------------------------------------------------\n" +
                "Total $245";
        String actual =store.createInvoice().getDetailWithQuantityAndUnitWithPromo() ;
        assertEquals(expected, actual);
    }
}
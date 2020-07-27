package samuel.practices.second;

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
    public void testInvoicePrintBasicDetail() {
        Store store = new Store();
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Milk", 10));
        String  expected = "";
        expected = expected + "Bread   -       $1"   + "\n";
        expected = expected + "Milk    -       $10"  + "\n";
        expected = expected + "--------------------" + "\n";
        expected = expected + "TOTAL           $11"  + "\n";
        String actual = store.createInvoice().getBasicDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoicePrintBasicDetailWhitQuantity() {
        Store store = new Store();
        store.buy(new Product(3, "Bread", 1));
        store.buy(new Product(2, "Milk", 10));

        String expected     = "Cant   Product    Price    Total" + "\n";
        expected = expected + "--------------------------------" + "\n";
        expected = expected + "3 -    Bread -   $1       $3"     + "\n";
        expected = expected + "2 -    Milk  -   $10      $20"    + "\n";
        expected = expected + "--------------------------------" + "\n";
        expected = expected + "TOTAL                      $23"   + "\n";
        String actual = store.createInvoice().getDetailWithQuantity();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInvoicePrintBasicDetailWhitQuantityAndUnit() {
        Store store = new Store();
        store.buy(new Product(3, "Bread", "u", 1));
        store.buy(new Product(2, "Milk" , "lt", 10));
        store.buy(new Product(5, "Rice" , "kg", 5));
        String expected     = "Cant   Product    Price    Total" + "\n";
        expected = expected + "--------------------------------" + "\n";
        expected = expected + "3 u  -  Bread  -   $1       $3"   + "\n";
        expected = expected + "2 lt -  Milk   -   $10      $20"  + "\n";
        expected = expected + "5 kg -  Rice   -   $5       $25"  + "\n";
        expected = expected + "--------------------------------" + "\n";
        expected = expected + "TOTAL                      $48"   + "\n";
        String actual = store.createInvoice().getDetailWithQuantityUnit();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInvoicePrintBasicDetailWhitQuantityAndUnitPromotion() {
        Store store = new Store();
        store.buy(new Product(10, "Bread", "u",  1, 1));
        store.buy(new Product(5,  "Milk" , "lt", 10, 5));
        store.buy(new Product(10, "Oil"  , "lt",  10, 10));
        store.buy(new Product(20, "Rice" , "kg", 5, 10));

        String expected     = "Cant   Product  Price  Discount  Total"   + "\n";
        expected = expected + "----------------------------------------" + "\n";
        expected = expected + "10 u  - Bread   $1     $1        $9"      + "\n";
        expected = expected + " 5 lt - Milk    $10    $5        $45"     + "\n";
        expected = expected + "10 lt - Oil     $10    $10       $90"     + "\n";
        expected = expected + "20 kg - Rice    $5     $10       $90"     + "\n";
        expected = expected + "----------------------------------------" + "\n";
        expected = expected + "TOTAL                           $234"    + "\n";
        String actual = store.createInvoice().getDetailWithQuantityUnitDiscount();
        assertEquals(expected, actual);
    }
}
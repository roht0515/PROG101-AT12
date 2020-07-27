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
    public void testInvoiceGetCostOfEachItemAndTotalWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("Bread", 1));
        String expected =   "Bread          -        $1"+"\n"+
                            "----------------------------"+"\n"+
                            "TOTAL                   $1";
        String actual = store.createInvoice().getCostOfEachItemAndTotal();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetCostOfEachItemAndTotalWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1));
        store.buy(new Product("Milk", 10));
        String expected =   "Bread          -        $1" + "\n" +
                            "Milk           -        $10" + "\n" +
                            "----------------------------" + "\n" +
                            "TOTAL                   $11";
        String actual = store.createInvoice().getCostOfEachItemAndTotal();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithCantToOneProduct() {
        Store store = new Store();
        store.buy(new Product("Bread", 1, 2));
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "2 -         Bread          -        $1          $2" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $2";
        String actual = store.createInvoice().getDetailWithCant();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithCantToTwoProducts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1, 3));
        store.buy(new Product("Milk", 10, 2));
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "3 -         Bread          -        $1          $3" + "\n" +
                            "2 -         Milk           -        $10         $20" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $23";
        String actual = store.createInvoice().getDetailWithCant();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithCantToThreeProducts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1, 3));
        store.buy(new Product("Milk", 10, 2));
        store.buy(new Product("Apples", 5, 11));
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "3 -         Bread          -        $1          $3" + "\n" +
                            "2 -         Milk           -        $10         $20" + "\n" +
                            "11 -        Apples         -        $5          $55" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $78";
        String actual = store.createInvoice().getDetailWithCant();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithCantAndUnitToOneProduct() {
        Store store = new Store();
        store.buy(new Product("Bread", 1, 2));
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "2 u -       Bread          -        $1          $2" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $2";
        String actual = store.createInvoice().getDetailWithCantAndUnit();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithCantAndUnitToTwoProducts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1, 3));
        store.buy(new Product("Milk", 10, 2, "lt"));
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "3 u -       Bread          -        $1          $3" + "\n" +
                            "2 lt -      Milk           -        $10         $20" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $23";
        String actual = store.createInvoice().getDetailWithCantAndUnit();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithCantAndUnitToFourProducts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1, 3));
        store.buy(new Product("Milk", 10, 2, "lt"));
        store.buy(new Product("Rice", 5, 5, "kg"));
        store.buy(new Product("Beer", 18, "pack"));
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "3 u -       Bread          -        $1          $3" + "\n" +
                            "2 lt -      Milk           -        $10         $20" + "\n" +
                            "5 kg -      Rice           -        $5          $25" + "\n" +
                            "1 pack -    Beer           -        $18         $18" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $66";
        String actual = store.createInvoice().getDetailWithCantAndUnit();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithOnePromoNotUsedToOneProduct() {
        Store store = new Store();
        Product product = new Product("Milk", 10, 2, "lt");
        store.addPromo(new Promo("Bread", 10, 9));
        store.buy(product);
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "2 lt -      Milk           -        $10         $20" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $20";
        String actual = store.createInvoice().getDetailWithCantAndUnit();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithOnePromoUsedToOneProduct() {
        Store store = new Store();
        Product product = new Product("Milk", 10, 2, "lt");
        store.addPromo(new Promo("Milk", 2, 18));
        store.buy(product);
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "2 lt -      Milk           -        $10         $18  -10%" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $18";
        String actual = store.createInvoice().getDetailWithCantAndUnit();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithOnePromoUsedToTwoProducts() {
        Store store = new Store();
        store.addPromo(new Promo("Milk", 2, 18));
        store.buy(new Product("Milk", 10, 2, "lt"));
        store.buy(new Product("Rice", 5, 5, "kg"));
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "2 lt -      Milk           -        $10         $18  -10%" + "\n" +
                            "5 kg -      Rice           -        $5          $25" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $43";
        String actual = store.createInvoice().getDetailWithCantAndUnit();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithTwoPromoUsedToTwoProducts() {
        Store store = new Store();
        store.addPromo(new Promo("Milk", 2, 18));
        store.addPromo(new Promo("Rice", 4, 18));
        store.buy(new Product("Milk", 10, 2, "lt"));
        store.buy(new Product("Rice", 5, 5, "kg"));
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "2 lt -      Milk           -        $10         $18  -10%" + "\n" +
                            "5 kg -      Rice           -        $5          $23  -8%" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $41";
        String actual = store.createInvoice().getDetailWithCantAndUnit();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceGetDetailWithTwoPromoUsedToTwoMuchQuantityOfProducts() {
        Store store = new Store();
        store.addPromo(new Promo("Milk", 2, 18));
        store.addPromo(new Promo("Rice", 5, 22));
        store.buy(new Product("Milk", 10, 10, "lt"));
        store.buy(new Product("Rice", 5, 22, "kg"));
        String expected =   "Cant        Product                 Price       Total" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "10 lt -     Milk           -        $10         $90  -10%" + "\n" +
                            "22 kg -     Rice           -        $5          $98  -11%" + "\n" +
                            "--------------------------------------------------------" + "\n" +
                            "TOTAL                                           $188";
        String actual = store.createInvoice().getDetailWithCantAndUnit();
        assertEquals(expected, actual);
    }
}
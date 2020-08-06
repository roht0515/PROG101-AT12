package rodrigo.practices.second;
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
        store.buyProduct(new Product("bread", 1));
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buyProduct(new Product("bread", 1));
        store.buyProduct(new Product("milk", 10));
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }


    @Test
    public void testInvoicePrintBasicDetail() {
        Store store = new Store();
        store.buyProduct(new Product("Bread", 1));
        store.buyProduct(new Product("Milk", 10));
        String  expected = "";
        expected += "Bread\t-\t\t$1\n";
        expected += "Milk\t-\t\t$10\n";
        expected += "--------------------\n";
        expected += "TOTAL\t\t\t$11";
        String actual = store.createInvoice().getSimpleDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoicePrintBasicDetailWhitQuantity() {
        Store store = new Store();
        store.buyProduct(new Product(3, "Bread", 1));
        store.buyProduct(new Product(2, "Milk", 10));

        String expected = "Cant   Product    Price    Total" + "\n";
        expected += "--------------------------------" + "\n";
        expected += "3 -\t\tBread\t-\t$1\t\t$3"   + "\n";
        expected += "2 -\t\tMilk\t-\t$10\t\t$20"  + "\n";
        expected += "--------------------------------" + "\n";
        expected += "TOTAL\t\t\t\t\t\t$23";
        String actual = store.createInvoice().getDetailWithQuantity();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoicePrintBasicDetailWhitQuantityAndUnit() {
        Store store = new Store();
        store.buyProduct(new Product(3, "Bread", "u", 1));
        store.buyProduct(new Product(2, "Milk" , "lt", 10));
        store.buyProduct(new Product(5, "Rice" , "kg", 5));
        String expected = "Cant       Product    Price    Total\n";
        expected += "-------------------------------------" + "\n";
        expected += "3u -\t\tBread \t-\t$1\t\t$3"   + "\n";
        expected += "2lt -\t\tMilk \t-\t$10\t\t$20"  + "\n";
        expected += "5kg -\t\tRice \t-\t$5\t\t$25"  + "\n";
        expected += "-------------------------------------" + "\n";
        expected += "TOTAL\t\t\t\t\t\t\t$48";
        String actual = store.createInvoice().getDetailWithQuantityAndType();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoicePrintBasicDetailWhitQuantityAndPromotion() {
        Store store = new Store();
        store.buyProduct(new Product(10, "Bread", 1,  "U", 1));
        store.buyProduct(new Product(5,  "Milk" , 10 , "lt", 5));
        store.buyProduct(new Product(10, "Oil"  , 10 ,  "lt", 10));
        store.buyProduct(new Product(20, "Rice" , 5, "kg", 10));

        String expected = "Cant       Product    Price    Discount    Total"   + "\n";
        expected += "------------------------------------------------" + "\n";
        expected += "10U -\t\tBread \t-\t$1\t\t$1\t\t\t$9"      + "\n";
        expected += "5lt -\t\tMilk \t-\t$10\t\t$5\t\t\t$45"     + "\n";
        expected += "10lt -\t\tOil \t-\t$10\t\t$10\t\t\t$90"     + "\n";
        expected += "20kg -\t\tRice \t-\t$5\t\t$10\t\t\t$90"     + "\n";
        expected += "------------------------------------------------" + "\n";
        expected += "TOTAL\t\t\t\t\t\t\t\t\t\t$234";
        String actual = store.createInvoice().getDetailWithQuantityAndTypeAndDiscount();
        assertEquals(expected, actual);
    }
}
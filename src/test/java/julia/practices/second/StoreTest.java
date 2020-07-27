package julia.practices.first;

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
        store.buy(new Product("bread", 1, "u"));
        int expected = 1;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testTotalInvoiceWithTwoProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, "u"));
        store.buy(new Product("milk", 10, "lt"));
        int expected = 11;
        int actual = store.createInvoice().getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDetailUnitWithOneProduct() {
        Store store = new Store();
        store.buy(new Product("bread", 1, "u"));
        String header = "Cant\tProduct\t\tPrice\tTotal\n";
        String tableLine = "-------------------------------------\n";
        String item = "1 u -\tbread -\t\t$1   \t$1\n";
        String total = "Total\t\t\t\t\t\t$1";
        String expected = header+ tableLine + item + tableLine + total;
        String actual = store.createInvoice().getDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDatailUnitWithMoreProducts() {
        Store store = new Store();
        store.buy(new Product("bread", 1, "u"));
        store.buy(new Product("bread", 1, "u"));
        store.buy(new Product("bread", 1,"u"));
        store.buy(new Product("milk", 10, "lt"));
        store.buy(new Product("milk", 10, "lt"));
        String header = "Cant\tProduct\t\tPrice\tTotal\n";
        String tableLine = "-------------------------------------\n";
        String item = "3 u -\tbread -\t\t$1   \t$3\n"+
                "2 lt -\tmilk -\t\t$10   \t$20\n";
        String total = "Total\t\t\t\t\t\t$23";
        String expected = header+ tableLine + item + tableLine + total;
        String actual = store.createInvoice().getDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvoiceDatailUnitWithMoreDiferentProducts() {
        Store store = new Store();
        store.buy(new Product("Bread", 1, "u"));
        store.buy(new Product("Bread", 1, "u"));
        store.buy(new Product("Bread", 1,"u"));
        store.buy(new Product("Milk", 10, "lt"));
        store.buy(new Product("Milk", 10, "lt"));
        store.buy(new Product("Rice", 5, "kg"));
        store.buy(new Product("Rice", 5, "kg"));
        store.buy(new Product("Rice", 5, "kg"));
        store.buy(new Product("Rice", 5, "kg"));
        store.buy(new Product("Rice", 5, "kg"));
        String header = "Cant\tProduct\t\tPrice\tTotal\n";
        String tableLine = "-------------------------------------\n";
        String item = "3 u -\tBread -\t\t$1   \t$3\n"+
                "2 lt -\tMilk -\t\t$10   \t$20\n"+
                "5 kg -\tRice -\t\t$5   \t$25\n";
        String total = "Total\t\t\t\t\t\t$48";
        String expected = header+ tableLine + item + tableLine + total;
        String actual = store.createInvoice().getDetail();
        assertEquals(expected, actual);
    }

    @Test
    public void testCostTotalWithPromotionTenUnitsBread() {
        Store store = new Store();
        for (int i = 0; i <10; i++) {
            store.buy(new Product("Bread",1, "u"));
        }
        int expected = 9;
        int actual = store.createInvoice().getCostTotalWithPromotios();
        assertEquals(expected, actual);
    }

    @Test
    public void testCostTotalWithPromotionMoreTenUnitsBread() {
        Store store = new Store();
        for (int i = 0; i <30; i++) {
            store.buy(new Product("Bread",1, "u"));
        }
        int expected = 27;
        int actual = store.createInvoice().getCostTotalWithPromotios();
        assertEquals(expected, actual);
    }

    @Test
    public void testCostTotalWithPromotionPerFiveOrMoreUnitsMilk() {
        Store store = new Store();
        for (int i = 0; i < 5; i++) {
            store.buy(new Product("Milk",10, "lt"));
        }
        int expected = 45;
        int actual = store.createInvoice().getCostTotalWithPromotios();
        assertEquals(expected, actual);
    }

    @Test
    public void testCostTotalWithPromotionPerTenOrMoreUnitsOil() {
        Store store = new Store();
        for (int i = 0; i < 10; i++) {
            store.buy(new Product("Oil",10, "lt"));
        }
        int expected = 90;
        int actual = store.createInvoice().getCostTotalWithPromotios();
        assertEquals(expected, actual);
    }

    @Test
    public void testCostTotalWithPromotionPerTwentyOrMoreUnitsRice() {
        Store store = new Store();
        for (int i = 0; i < 20; i++) {
            store.buy(new Product("Rice",5, "kg"));
        }
        int expected = 90;
        int actual = store.createInvoice().getCostTotalWithPromotios();
        assertEquals(expected, actual);
    }

     @Test
    public void testPrintCostTotalWithDiscountForBread() {
         Store store = new Store();
         for (int i = 0; i <30; i++) {
             store.buy(new Product("Bread",1, "u"));
         }
         String expected = "* 30u of Bread, pay $27, discount %10\n";
         String actual = store.createInvoice().discountsPrint();
         assertEquals(expected, actual);
     }

    @Test
    public void testPrintCostTotalWithDiscountForMilk() {
        Store store = new Store();
        for (int i = 0; i <5; i++) {
            store.buy(new Product("Milk",10, "lt"));
        }
        String expected = "* 5lt of Milk, pay $45, discount %10\n";
        String actual = store.createInvoice().discountsPrint();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintCostTotalWithDiscountForOil() {
        Store store = new Store();
        for (int i = 0; i < 10; i++) {
            store.buy(new Product("Oil",10, "lt"));
        }
        String expected = "* 10lt of Oil, pay $90, discount %10\n";
        String actual = store.createInvoice().discountsPrint();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintCostTotalWithDiscountForRice() {
        Store store = new Store();
        for (int i = 0; i < 20; i++) {
            store.buy(new Product("Rice",5, "kg"));
        }
        String expected = "* 20kg of Rice, pay $90, discount %5\n";
        String actual = store.createInvoice().discountsPrint();
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintCostTotalWithDiscountTwoDiferentsProduct () {
        Store store = new Store();
        for (int i = 0; i < 20; i++) {
            store.buy(new Product("Rice",5, "kg"));
        }
        for (int i = 0; i < 10; i++) {
            store.buy(new Product("Oil",10, "lt"));
        }
        String rice = "* 20kg of Rice, pay $90, discount %5\n";
        String oil = "* 10lt of Oil, pay $90, discount %10\n";
        String expected = oil + rice;
        String actual = store.createInvoice().discountsPrint();
        assertEquals(expected ,actual);
    }

    @Test
    public void testPrintCostTotalWithDiscountDiferentsProduct () {
        Store store = new Store();
        for (int i = 0; i <30; i++) {
            store.buy(new Product("Bread",1, "u"));
        }
        for (int i = 0; i <5; i++) {
            store.buy(new Product("Milk",10, "lt"));
        }
        for (int i = 0; i < 20; i++) {
            store.buy(new Product("Rice",5, "kg"));
        }
        for (int i = 0; i < 10; i++) {
            store.buy(new Product("Oil",10, "lt"));
        }

        String bread = "* 30u of Bread, pay $27, discount %10\n";
        String milk = "* 5lt of Milk, pay $45, discount %10\n";
        String rice = "* 20kg of Rice, pay $90, discount %5\n";
        String oil = "* 10lt of Oil, pay $90, discount %10\n";
        String expected = oil + bread + milk + rice;
        String actual = store.createInvoice().discountsPrint();
        assertEquals(expected ,actual);
    }
}

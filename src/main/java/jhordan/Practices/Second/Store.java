package jhordan.Practices.Second;


import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> tempProducts;

    public Store() {
        tempProducts = new ArrayList<Product>();
    }
    /**it creates a new invoice and returns an empty invoice**/
    public Invoice createInvoice() {
        Invoice result = new Invoice(tempProducts);
        tempProducts.clear();
        return result;
    }
    /**it adds a Product*/
    public void buy(final Product product) {
        tempProducts.add(product);
    }
}

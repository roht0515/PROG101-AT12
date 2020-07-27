package practices.second.laura;


import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> tempProducts;

    public Store() {
        tempProducts = new ArrayList<Product>();
    }

    /**
     *
     * @return Invoice
     */
    public Invoice createInvoice() {
        Invoice result = new Invoice(tempProducts);
        tempProducts.clear();
        return result;
    }
    /**
     *
     * buy
     */
    public void buy(final Product bread) {
        tempProducts.add(bread);
    }
}

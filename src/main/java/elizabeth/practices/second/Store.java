package elizabeth.practices.second;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> tempProducts;

    public Store() {
        tempProducts = new ArrayList<Product>();
    }

    /**
     *
     * @return List<Product> getTempProducts
     */
    public List<Product> getTempProducts() {
        return tempProducts;
    }

    /**
     *
     * @Method void setTempProducts
     */
    public void setTempProducts(final List<Product> tempProducts) {
        this.tempProducts = tempProducts;
    }
    /**
     *
     * @return Invoice createInvoice
     */
    public Invoice createInvoice() {
        Invoice result = new Invoice(tempProducts);
        tempProducts.clear();
        return result;
    }

    /**
     *
     * @Method void buy
     */
    public void buy(final Product bread) {
        tempProducts.add(bread);
    }
}

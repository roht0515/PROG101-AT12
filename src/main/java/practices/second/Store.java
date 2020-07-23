package practices.second;


import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> tempProducts;

    public Store(){
        tempProducts = new ArrayList<Product>();
    }
    public Invoice createInvoice() {
        Invoice result = new Invoice(tempProducts);
        tempProducts.clear();
        return result;
    }

    public void buy(Product bread) {
        tempProducts.add(bread);
    }
}

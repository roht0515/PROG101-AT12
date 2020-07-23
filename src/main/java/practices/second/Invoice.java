package practices.second;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    List<Product> products;

    public Invoice(List<Product> tempProducts){
        //products = tempProducts;
        products = new ArrayList<>();
        for (Product product: tempProducts) {
            products.add(product);
        }

    }
    public int getTotalCost() {
        int totalCost = 0;
        for (Product product : products) {
            totalCost = totalCost + product.getPrice();
        }
        return totalCost;
    }

    public String getDetail() {
        String header = "Cant Product Price Total";
        String tableLine = "--------------------------------------------------------";
        return header + "\n" + tableLine;
    }
}

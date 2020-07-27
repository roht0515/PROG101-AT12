package practices.second.laura;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Product> products;

    public Invoice(final List<Product> tempProducts) {
        products = new ArrayList<>();
        for (Product product: tempProducts) {
            products.add(product);
        }

    }

    /**
     *
     * @return int costTotal
     */
    public int getTotalCost() {
        int totalCost = 0;
        for (Product product : products) {
            totalCost = totalCost + product.getTotalPerProduct();
        }
        return totalCost;
    }
    
    /**
     *
     * @return String detail
     */
    public String getDetail() {
        String header = "Cant Product Price Total";
        String tableLine = "--------------------------------------------------------";
        String body = "";
        String ending = "";
        //int aux = getTotalPerProduct();
        for (Product product: products){
            body = body + Integer.toString(product.getQuantity()) + "-" + product.getUnit() + "    "+ product.getName() + " -   " + 
            Integer.toString(product.getPrice()) + " " + Integer.toString(product.getTotalPerProduct()) + "\n";
        }
        ending = "Total" + "             " + Integer.toString(getTotalCost());
        return header + "\n" + tableLine + "\n" + body + tableLine + "\n" + ending;
    }
}

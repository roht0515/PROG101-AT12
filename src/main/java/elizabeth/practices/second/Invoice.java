package elizabeth.practices.second;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private final List<Product> products;

    public Invoice(List<Product> tempProducts) {
        //products = tempProducts;
        products = new ArrayList<>();
        for (Product product: tempProducts) {
            products.add(product);
        }
    }

    /**
     *
     * @return int totalCost
     */
    public int getTotalCost() {
        int totalCost = 0;
        for (Product product: products) {
            product.verifyPromotion();
            totalCost = totalCost + product.getTotalCostProduct();
        }
        return totalCost;
    }

    /**
     *
     * @return String getDetail
     */
    public String getDetail() {
        String header = "Cant\tProduct\t\tPrice\tTotal\n";
        String headline = "-------------------------------\n";
        String detail = "";
        for (Product product: products) {
            detail = detail + product.getQuantity() + "\t\t";
            detail = detail + product.getName() + "\t\t";
            detail = detail + product.getPrice() + "\t\t";
            detail = detail + product.getTotalCostProduct() + "\n";
        }
        String footerLine = "-------------------------------\n";
        String totalCost = "Total\t\t\t\t\t\t"+getTotalCost();

        return header + headline + detail + footerLine + totalCost;
    }
    /**
     *
     * @return String getDetailComplete
     */
    public String getDetailComplete() {
        String header = "Cant\tProduct\t\tPrice\tTotal\n";
        String headline = "-------------------------------\n";
        String detail = "";
        for (Product product: products) {
            detail = detail + product.getQuantity() +" ";
            detail = detail + product.getUnit() + "\t\t";
            detail = detail + product.getName() + "\t\t";
            detail = detail + "$"+product.getPrice() + "\t\t";
            detail = detail + "$"+product.getTotalCostProduct() + "\n";
        }
        String footerLine = "-------------------------------\n";
        String totalCost = "Total\t\t\t\t\t\t$"+getTotalCost();

        return header + headline + detail + footerLine + totalCost;
    }

    /**
     *
     * @return String getDetailCompleteWithDiscount
     */
    public String getDetailCompleteWithDiscount() {
        String header = "Cant\t\tProduct\t\tPrice\tCost\tDiscount Cost\n";
        String headline = "-----------------------------------------------------\n";
        String detail = "";
        for (Product product: products) {
            product.verifyPromotion();
            detail = detail + product.getQuantity() +" ";
            detail = detail + product.getUnit() + "\t\t";
            detail = detail + product.getName() + "\t\t";
            detail = detail + "$"+product.getPrice() + "\t\t";
            detail = detail + "$"+(product.getPrice() * product.getQuantity()) + "\t\t";
            if (product.isPromotion()) {
                detail = detail + "$"+product.getTotalCostProduct() + "\n";
            } else {
                detail = detail + "-\n";
            }
        }
        String footerLine = "-----------------------------------------------------\n";
        String totalCost = "Total\t\t\t\t\t\t\t\t\t$"+getTotalCost();

        return header + headline + detail + footerLine + totalCost;
    }
}

package samuel.practices.second;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Product> products;
    private Print print;

    public Invoice(final List<Product> tempProducts) {
        print = new Print();
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
            totalCost = totalCost + ((product.getPrice() * product.getCant()) - product.getDiscount());
        }
        return totalCost;
    }
    /**
     *
     * @return String detail basic
     */
    public String getBasicDetail() {
        String detail = "";
        for (Product product : products) {
            detail = detail + print.getPrintBasicModel(product);
        }
        detail = detail + print.getPrintTotal(getTotalCost());

        return detail;
    }
    /**
     *
     * @return String getDetailWithQuantity
     */
    public String getDetailWithQuantity() {
        String detail = print.getLineBasicWhitQuantityHeader();
        for (Product product : products) {
            detail = detail + print.getPrintModelWithQuantity(product);
        }
        detail = detail + print.getLineBasicWhitQuantityTotal(getTotalCost());

        return detail;
    }
    /**
     *
     * @return String getDetailWithQuantityUnit
     */
    public String getDetailWithQuantityUnit() {
        String detail = print.getLineBasicWhitQuantityHeader();
        for (Product product : products) {
            detail = detail + print.getPrintModelWithQuantityUnit(product);
        }
        detail = detail + print.getLineBasicWhitQuantityTotal(getTotalCost());
        return detail;
    }
    /**
     *
     * @return String getDetailWithQuantityUnitDiscount
     */
    public String getDetailWithQuantityUnitDiscount() {
        String detail = print.getLineWhitQuantityDiscountHeader();
        for (Product product : products) {
            detail = detail + print.getPrintModelWithQuantityUnitDiscount(product);
        }
        detail = detail + print.getLineWhitQuantityTotalDiscount(getTotalCost());
        return detail;
    }
}

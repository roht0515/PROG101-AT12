package jhordan.Practices.Second;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Product> products;
    private int totalCost;
    private int priceQuantity;
    private  String details;
    static final double PERCENTAGE = 0.10;

    public Invoice(final List<Product> tempProducts) {
        //products = tempProducts;
        products = new ArrayList<>();
        for (Product product : tempProducts) {
            products.add(product);
        }

    }

    /**
     * get the total cost
     */
    public int getTotalCost() {
        totalCost = 0;
        for (Product product : products) {
            totalCost = totalCost + product.getPrice();
        }
        return totalCost;
    }

    /**
     * return purchase details
     */
    public String getDetail() {
        totalCost = 0;
        details = "";
        for (Product product : products) {
            totalCost = totalCost + product.getPrice();
            details = details + product.getName() + " - " + "$" + product.getPrice() + "\n";
        }
        details = details + "----------------------------\n" + "Total $" + totalCost;
        return details;
    }

    /**
     * return purchase details with quantity
     */
    public String getDetailWithQuantity() {
        totalCost = 0;
        priceQuantity = 0;
        details = "Cant Product Price Total\n" + "--------------------------------------------------------\n";
        for (Product product : products) {
            priceQuantity = product.getPrice() * product.getQuantity();
            totalCost = totalCost + priceQuantity;
            details = details + product.getQuantity() + " - " + product.getName() + " - " + "$" + product.getPrice() + " $" + priceQuantity + "\n";
        }
        details = details + "--------------------------------------------------------\n" + "Total $" + totalCost;
        return details;
    }


    /**
     * return purchase details with quantity and unit
     */
    public String getDetailWithQuantityAndUnit() {
        totalCost = 0;
        priceQuantity = 0;
        details = "Cant Product Price Total\n" + "--------------------------------------------------------\n";
        for (Product product : products) {
            priceQuantity = product.getPrice() * product.getQuantity();
            totalCost = totalCost + priceQuantity;
            details = details + product.getQuantity() + getUnit(product) + " - " + product.getName() + " - " + "$" + product.getPrice() + " $" + priceQuantity + "\n";
        }
        details = details + "--------------------------------------------------------\n" + "Total $" + totalCost;
        return details;
    }

    /**
     * return purchase details with Promo, quantity and unit
     */
    public String getDetailWithQuantityAndUnitWithPromo() {
        totalCost = 0;
        priceQuantity = 0;
        int discount = 0;
        details = "Cant Product Price Total Discount\n" + "--------------------------------------------------------\n";
        for (Product product : products) {
            priceQuantity = product.getPrice() * product.getQuantity();
            totalCost = totalCost + priceQuantity;
            if (product.doesHavePromo()) {
                discount = discount + promo(priceQuantity);
                details = details + product.getQuantity() + getUnit(product) + " - " + product.getName() + " - " + "$" + product.getPrice() + " $" + priceQuantity  + " 10%" + "\n";
            } else {
                details = details + product.getQuantity() + getUnit(product) + " - " + product.getName() + " - " + "$" + product.getPrice() + " $" + priceQuantity + "\n";
            }
        }
        details = details + "--------------------------------------------------------\n" + "Total $" + (totalCost - discount);
        return details;
    }
    /**
     * return the kind of unit
     */
    public String getUnit(final Product product) {
        String kindUnit = "";
        switch (product.getUnit()) {
            case "Kilograms":
                kindUnit = " kg";
                break;
            case "Liters":
                kindUnit = " lt";
                break;
            case "Unit":
                kindUnit = " u";
                break;
            default:
                break;
        }
        return kindUnit;
    }
    /**
     * return percentage of the promo
     */
    public int promo(final int priceQuantity) {

        return (int) (priceQuantity * PERCENTAGE);
    }


}

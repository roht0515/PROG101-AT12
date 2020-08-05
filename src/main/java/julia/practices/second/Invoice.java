package julia.practices.first;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

public class Invoice {
    private  List<Product> products;
    private static final int PORCENT_TEN = 10;
    private static final int PORCENT_FIVE = 5;
    private static final int CANT_TEN = 10;
    private static final int CANT_FIVE = 5;
    private static final int CANT_TWENTY = 20;
    private static final int PRICE_UNIT_PORCENT_TEN = 9;
    private static final double PRICE_UNIT_PORCENT_FIVE =  4.5;

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
        Map<String, Integer> quantityProducts = getMapProductQuantity();
        for (Map.Entry<String, Integer> entry : quantityProducts.entrySet()) {
            Integer cant = entry.getValue();
            String name = entry.getKey();
            totalCost = totalCost + (cant * getPriceUnidad(name));
        }
        return totalCost;
    }
    /**
     *
     * @return String detail
     */
    public String getDetail() {
        String header = "Cant\tProduct\t\tPrice\tTotal\n";
        String tableLine = "-------------------------------------\n";
        String items = "";
        Map<String, Integer> quantityProducts =  getMapProductQuantity();
        for (Map.Entry<String, Integer> entry : quantityProducts.entrySet()) {
            String name = entry.getKey();
            Integer cant = entry.getValue();
            items = items + cant + " " + getUnitProduct(name)
            + " -" + "\t"
            + name  + " -\t\t$"
            + getPriceUnidad(name) + "   \t$"
            + cant * getPriceUnidad(name) + "\n";
        }

        String totalPrice = "Total\t\t\t\t\t\t$" + getTotalCost();
        return header + tableLine + items + tableLine + totalPrice;
    }

    private int getPriceUnidad(final String productName) {
        int price = 0;
        for (Product product : products) {
            if (product.getName().equals(productName)) {
               price = product.getPrice();
            }
        }
        return price;
    }

    private String getUnitProduct(final String productName) {
        String unit = "";
        for (Product product: products) {
            if (product.getName().equals(productName)) {
                unit = product.getUnit();
            }
        }
        return unit;
    }

    private Map<String, Integer> getMapProductQuantity() {
        Map<String, Integer> quantity = new HashMap<>();
        Iterator<Product> itremo = products.iterator();
        while (itremo.hasNext()) {
            Product newProduct = itremo.next();
            if (!quantity.containsKey(newProduct.getName())) {
                quantity.put(newProduct.getName(), 1);
            } else {
                Integer add = quantity.get(newProduct.getName());
                quantity.remove(newProduct.getName());
                quantity.put(newProduct.getName(), add + 1);
            }
        }
        return quantity;
    }
    /**
    * @return int cost total with promotions
    * */
    public int getCostTotalWithPromotios() {
        Map<String, Integer> mapProducts = getMapProductQuantity();
        int cost = 0;
        for (Map.Entry<String, Integer> products : mapProducts.entrySet()) {
            String nameproduct = products.getKey();
            Integer cant = products.getValue();
            cost = cost + getCostWithPromotionXProduct(nameproduct, cant);
        }
        return cost;
    }

    private int getCostWithPromotionXProduct(final String name, final int cant) {
        int cost = 0;
        switch (name) {
            case "Bread":
                cost = getCostWithPromotionBread(cant);
                break;
            case "Milk":
                cost = getCostWithPromotionMilk(cant);
                break;
            case "Oil":
                cost = getCostWithPromotionOil(cant);
                break;
            case "Rice":
                cost = getCostWithPromotionRice(cant);
                break;
            default:
                break;
        }
        return cost;
    }

    private int getCostWithPromotionBread(final int cant) {
        int bread = 0;
        if (cant >= CANT_TEN) {
            int repet10 = cant / CANT_TEN;
            int mod = cant % CANT_TEN;
            bread = (mod * getPriceUnidad("Bread")) + (repet10 * 1 * PRICE_UNIT_PORCENT_TEN);
        }
        return bread;
    }

    private int getCostWithPromotionMilk(final int cant) {
        int milk = 0;
        if (cant >= CANT_FIVE) {
            int repet5 = cant / CANT_FIVE;
            int mod = cant % CANT_FIVE;
            milk = (mod * getPriceUnidad("Milk")) + (repet5 * CANT_FIVE  * PRICE_UNIT_PORCENT_TEN);
        }
        return milk;
    }

    private int getCostWithPromotionOil(final int cant) {
        int oil = 0;
        if (cant >= CANT_TEN) {
            int repet10 = cant / CANT_TEN;
            int mod = cant % CANT_TEN;
            oil = (mod * getPriceUnidad("Oil")) + (repet10 * CANT_TEN  * PRICE_UNIT_PORCENT_TEN);
        }
        return oil;
    }

    private int getCostWithPromotionRice(final int cant) {
        int rice = 0;
        if (cant >= CANT_TWENTY) {
            int repet20 = cant / CANT_TWENTY;
            int mod = cant % CANT_TWENTY;
            rice = (int) ((mod * getPriceUnidad("Rice")) + (repet20 * CANT_TWENTY * PRICE_UNIT_PORCENT_FIVE));
        }
        return rice;
    }
    /**
     *
     * @return string discountPrint
     */
    public String discountsPrint() {
        String print = "";
        Map<String, Integer> mapProducts = getMapProductQuantity();
        for (Map.Entry<String, Integer> products : mapProducts.entrySet()) {
            String name = products.getKey();
            Integer cant = products.getValue();
            print = print + "* " + cant + getUnitProduct(name) + " of " + name + ", pay $"
            + getCostWithPromotionXProduct(name, cant) + ", discount %"
            + getPorcetage(name) + "\n";
        }
        return print;
    }

    private int getPorcetage(final String name) {
        int porcentage = 0;
        switch (name) {
            case "Bread":
                porcentage = PORCENT_TEN;
                break;
            case "Milk":
                porcentage = PORCENT_TEN;
                break;
            case "Oil":
                porcentage = PORCENT_TEN;
                break;
            case "Rice":
                porcentage = PORCENT_FIVE;
                break;
            default:
                break;
        }
       return porcentage;
    }
}

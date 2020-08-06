package angela.practices.second;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Product> products;
    private static final String CURRENCY = "$";
    private static final String SPLITTER = "-";
    private static final String PERCENT = "%";

    public Invoice(final List<Product> tempProducts) {
        //products = tempProducts;
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
            if (product.getPromo()) {
                totalCost += product.getCost();
            } else {
                totalCost += product.getPrice() * product.getCant();
            }
        }
        return totalCost;
    }

    /**
     *
     * @return String detail
     */
    public String getDetail() {
        String header = "Cant\t\t" + "Product" + "\t\tPrice\tTotal\n";

        String headLine = "--------------------------------------------------------\n";
        String productDetail = "";
        for (Product product: products) {
            int total = product.getCant() * product.getPrice();
            if (product.getUnit() == null) {
                String detail = String.format("%-6d %-4s %-8s%-3s %s%-6d %s%d\n", product.getCant(), SPLITTER, product.getName(), SPLITTER, CURRENCY, product.getPrice(), CURRENCY, total);
                productDetail += detail;
            } else if (product.getPromo()) {
                String detail = String.format("%-3d%-3s %-4s %-8s%-3s %s%-6d %s%-5d %d%s\n", product.getCant(), product.getUnit(), SPLITTER, product.getName(), SPLITTER, CURRENCY, product.getPrice(), CURRENCY, product.getCost(), product.getDesc(), PERCENT);
                productDetail += detail;
                header = "Cant\t\t" + "Product" + "\t\tPrice\tTotal\tDesc\n";
            } else {
                String detail = String.format("%-3d%-3s %-4s %-8s%-3s %s%-6d %s%d\n", product.getCant(), product.getUnit(), SPLITTER, product.getName(), SPLITTER, CURRENCY, product.getPrice(), CURRENCY, total);
                productDetail += detail;
            }
        }
        String footLine = "--------------------------------------------------------\n";
        String totalLine = String.format("Total %27s%d", CURRENCY, getTotalCost());
        return header + headLine + productDetail + footLine + totalLine;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Product> products;
    static final int CANT_SPACES_BEFORE_HYPEN = 15;
    static final int CANT_SPACES_BEFORE_PRODUCT = 12;
    static final int CANT_SPACES_BEFORE_TOTAL = 12;
    static final int ONE_HUNDRED = 100;

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
            totalCost += product.getTotalPrice();
        }
        return totalCost;
    }
    /**
     *
     * @return String get Cost of each item at invoice and show the Totl price.
     */
    public String getCostOfEachItemAndTotal() {
        String itemDetail = "";
        for (Product product : products) {
            String spaces = new String(new char[CANT_SPACES_BEFORE_HYPEN - product.getName().length()]).replace('\0', ' ');
            itemDetail += product.getName() + spaces + "-        $" + product.getPrice() + "\n";
        }
        String tableLine = "----------------------------" + "\n";
        String totalCost = "TOTAL                   $" + getTotalCost();
        return itemDetail + tableLine + totalCost;
    }
    /**
     *
     * @return String detail without unit of products
     */
    public String getDetailWithCant() {
        String header = "Cant        Product                 Price       Total";
        String tableLine = "--------------------------------------------------------";
        String itemDetail = "";
        for (Product product : products) {
            String newLine = "";
            String spacesBeforeProduct = new String(new char[CANT_SPACES_BEFORE_PRODUCT - (product.getCant() + " -").length()]).replace('\0', ' ');
            newLine += product.getCant() + " -" + spacesBeforeProduct + product.getName();
            String spacesBeforeHypen = new String(new char[CANT_SPACES_BEFORE_HYPEN - product.getName().length()]).replace('\0', ' ');
            newLine += spacesBeforeHypen + "-        $" + product.getPrice();
            String spacesBeforeTotal = new String(new char[CANT_SPACES_BEFORE_TOTAL - ("$" + product.getPrice()).length()]).replace('\0', ' ');
            newLine += spacesBeforeTotal + "$" + (product.getPrice() * product.getCant()) + "\n";
            itemDetail += newLine;
        }
        String totalCost = "TOTAL                                           $" + getTotalCost();
        return header + "\n" + tableLine + "\n" + itemDetail + tableLine + "\n" + totalCost;
    }
    /**
     *
     * @return String detail include unit of products
     */
    public String getDetailWithCantAndUnit() {
        String header = "Cant        Product                 Price       Total";
        String tableLine = "--------------------------------------------------------";
        String itemDetail = "";
        for (Product product : products) {
            String newLine = "";
            String spacesBeforeProduct = new String(new char[CANT_SPACES_BEFORE_PRODUCT - (product.getCant() + " " + product.getUnit() + " -").length()]).replace('\0', ' ');
            newLine += product.getCant() + " " + product.getUnit() + " -" + spacesBeforeProduct + product.getName();
            String spacesBeforeHypen = new String(new char[CANT_SPACES_BEFORE_HYPEN - product.getName().length()]).replace('\0', ' ');
            newLine += spacesBeforeHypen + "-        $" + product.getPrice();
            String spacesBeforeTotal = new String(new char[CANT_SPACES_BEFORE_TOTAL - ("$" + product.getPrice()).length()]).replace('\0', ' ');
            newLine += spacesBeforeTotal + "$" + product.getTotalPrice();
            if (product.getTotalPrice() < (product.getPrice() * product.getCant())) {
                newLine += "  -" + (ONE_HUNDRED - (product.getTotalPrice() * ONE_HUNDRED / (product.getPrice() * product.getCant()))) + "%";
            }
            newLine += "\n";
            itemDetail += newLine;
        }
        String totalCost = "TOTAL                                           $" + getTotalCost();
        return header + "\n" + tableLine + "\n" + itemDetail + tableLine + "\n" + totalCost;
    }
}

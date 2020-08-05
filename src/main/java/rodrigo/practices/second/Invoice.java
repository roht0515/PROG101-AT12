package rodrigo.practices.second;
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

    public int getTotalCost() {
        int cost = 0;
        for (Product product: products) {
            cost += product.getTotal();
        }
        return cost;
    }

    public String getSimpleDetail() {
        String detail = "";
        for (Product product: products) {
            detail += product.getName() + "\t-\t\t$" + product.getPrice() + "\n";
        }
        detail += "--------------------\n";
        detail += "TOTAL\t\t\t$" + getTotalCost();
        return detail;
    }

    public String getDetailWithQuantity() {
        String detail = "";
        String headers ="Cant   Product    Price    Total\n";
        String line = "--------------------------------\n";
        detail += headers;
        detail += line;
        for (Product product: products) {
            detail += product.getQuantity() +" -\t\t" + product.getName() + "\t-\t$" + product.getPrice()+ "\t\t$"+ product.getTotal() + "\n";
        }
        detail += line;
        detail += "TOTAL\t\t\t\t\t\t$" + getTotalCost();
        return detail;
    }

    public String getDetailWithQuantityAndType() {
        String detail = "";
        String headers ="Cant       Product    Price    Total\n";
        String line = "-------------------------------------\n";
        detail += headers;
        detail += line;
        for (Product product: products) {
            detail += product.getQuantity() +""+product.getType()+" -\t\t" + product.getName() + " \t-\t$" + product.getPrice()+ "\t\t$"+ product.getTotal() + "\n";
        }
        detail += line;
        detail += "TOTAL\t\t\t\t\t\t\t$" + getTotalCost();
        return detail;
    }

    public String getDetailWithQuantityAndTypeAndDiscount() {
        String detail = "";
        String headers ="Cant       Product    Price    Discount    Total\n";
        String line = "------------------------------------------------\n";
        detail += headers;
        detail += line;
        for (Product product: products) {
            detail += product.getQuantity() +""+product.getType()+" -\t\t" + product.getName() + " \t-\t$" + product.getPrice()+"\t\t$" + product.getDiscount() + "\t\t\t$"+ product.getTotal() + "\n";
        }
        detail += line;
        detail += "TOTAL\t\t\t\t\t\t\t\t\t\t$" + getTotalCost();
        return detail;
    }

}

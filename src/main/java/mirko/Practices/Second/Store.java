import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> tempProducts;
    private List<Promo> promos;

    public Store() {
        tempProducts = new ArrayList<Product>();
        promos = new ArrayList<Promo>();
    }

    /**
     *
     * @return Invoice
     */
    public Invoice createInvoice() {
        Invoice result = new Invoice(tempProducts);
        tempProducts.clear();
        return result;
    }
    /**
     *
     * buy
     */
    public void buy(final Product product) {
        for (Promo promo : promos) {
            if ((product.getName() == promo.getName()) && (product.getCant() >= promo.getCant())) {
                int timesToApplyPromo = product.getCant() / promo.getCant();
                int newPrice = (timesToApplyPromo * promo.getNewTotalPrice()) + ((product.getCant() - (timesToApplyPromo * promo.getCant())) * product.getPrice());
                product.setTotalPrice(newPrice);
            }
        }
        tempProducts.add(product);
    }

        /**
     *
     * @add new Promos
     */
    public void addPromo(final Promo promo) {
        promos.add(promo);
    }
}

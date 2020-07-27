package practices.second.laura;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(final String name, final int price, final int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    /**
     * @return String name
     */
    public String getName() {
        return name;
    }
    /**
     * @return int price
     */
    public int getPrice() {
        return price;
    }
    /**
     * @return int quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @return int totalPerProduct
     */
    public int getTotalPerProduct() {
        return quantity*price;
    }
}

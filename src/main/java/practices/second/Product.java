package practices.second;

public class Product {
    private String name;
    private int price;
    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
    }
    /**
     *
     * @return int price
     */
    public int getPrice() {
        return price;
    }
}

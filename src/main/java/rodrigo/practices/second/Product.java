package rodrigo.practices.second;
public class Product {
    private String name;
    private int price;
    private int quantity;
    private String type = "";
    private int discount = 0;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    public Product(final int quantity, final String name, final int price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public Product(final int quantity, final String name, final String type, final int price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Product(final int quantity, final String name, final int price, final String type, final int discount) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.type = type;
        this.discount = discount;
    }

    /**
     *
     * @return int actual price
     */
    public int getPrice() {
        return price;
    }
    /**
     *
     * @return String producto name
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @return int quantity
     */
    public int getQuantity() {
        return this.quantity;
    }
    /**
     *
     * @return int total amount
     */
    public int getTotal() {
            return (this.quantity * this.price) - this.discount;
    }
    /**
     *
     * @return String unit of product
     */
    public String getType() {
        return this.type;
    }
    /**
     *
     * @return int discount
     */
    public int getDiscount() {
        return discount;
    }
}

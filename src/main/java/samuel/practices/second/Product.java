package samuel.practices.second;

public class Product {
    private String name;
    private int price;
    private int cant;
    private String unit;
    private int discount;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
        this.cant = 1;
        this.unit = "";
        this.discount = 0;
    }

    public Product(final int cant, final String name, final int price) {
        this.cant = cant;
        this.name = name;
        this.price = price;
    }

    public Product(final int cant, final String name, final String unit, final int price) {
        this.cant = cant;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public Product(final int cant, final String name, final String unit, final int price, final int discount) {
        this.cant = cant;
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.discount = discount;
    }

    /**
     *
     * @return int price
     */
    public int getPrice() {
        return price;
    }
    /**
     *
     * @return String name of product
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @return int can
     */
    public int getCant() {
        return this.cant;
    }
    /**
     *
     * @return int total
     */
    public int getTotal() {
        return (this.cant * this.price) - this.discount;
    }
    /**
     *
     * @return String unit of product
     */
    public String getUnit() {
        return this.unit;
    }
    /**
     *
     * @return int discount
     */
    public int getDiscount() {
        return discount;
    }
}

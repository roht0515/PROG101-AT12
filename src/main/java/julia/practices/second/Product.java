package julia.practices.first;

public class Product {
    private String name;
    private int price;
    private String unit;
    public Product(final String name, final int price, final String unit) {
        this.name = name;
        this.price = price;
        this.unit = unit;
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
     * @return string name
     */
    public String getName() {
        return  name;
    }
    /**
     *
     * @return unit
     * */
    public String getUnit() {
        return unit;
    }
}

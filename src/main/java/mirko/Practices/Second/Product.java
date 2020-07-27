public class Product {
    private String name;
    private int price;
    private int cant = 1;
    private String unit = "u";
    private int totalPrice;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
        this.totalPrice = this.price * this.cant;
    }

    public Product(final String name, final int price, final int cant) {
        this.name = name;
        this.price = price;
        this.cant = cant;
        this.totalPrice = this.price * this.cant;
    }

    public Product(final String name, final int price, final String unit) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.totalPrice = this.price * this.cant;
    }

    public Product(final String name, final int price, final int cant, final String unit) {
        this.name = name;
        this.price = price;
        this.cant = cant;
        this.unit = unit;
        this.totalPrice = this.price * this.cant;
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
     * @return name
     */
    public String getName() {
        return name;
    }

        /**
     *
     * @return cant
     */
    public int getCant() {
        return cant;
    }

    /**
     *
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     *
     * @return int totalPrice
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     *
     * @set New Total Price
     */
    public void setTotalPrice(final int newTotalPrice) {
        this.totalPrice = newTotalPrice;
    }
}

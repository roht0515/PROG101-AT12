package angela.practices.second;

public class Product {
    private String name;
    private int price;
    private int cant;
    private String unit;
    private boolean promo;
    private int cost;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
        this.cant = 1;
    }

    public Product(final int cant, final String name, final int price) {
        this.name = name;
        this.price = price;
        this.cant = cant;
    }

    public Product(final int cant, final String name, final int price, final String unit) {
        this.name = name;
        this.price = price;
        this.cant = cant;
        this.unit = unit;
    }

    public Product(final int cant, final String name, final int price, final String unit, final boolean promo, final int cost) {
        this.name = name;
        this.price = price;
        this.cant = cant;
        this.unit = unit;
        this.promo = promo;
        this.cost = cost;

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
     * @return int price
     */
    public int getCant() {
        return cant;
    }

    /**
     *
     * @return string name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return string unit
     */

    public String getUnit() {
        return unit;
    }
    /**
     *
     * @return boolean has promo
     */

    public boolean getPromo() {
        return promo;
    }

    /**
     *
     * @return int cost
     */
    public int getCost() {
        return cost;
    }

    /**
     *
     * @return int % desc
     */
    public int getDesc(){
        return 100-(cost*100/(price*cant));
    }
}

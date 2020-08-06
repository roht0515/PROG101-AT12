package jhordan.Practices.Second;


public class Product {
    private String name;
    private int price;
    private int quantity;
    private String unit;
    private boolean promo;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
    }
    public Product(final String name, final int price, final int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(final String name, final int price, final int quantity, final String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }
    public Product(final String name, final int price, final int quantity, final String unit, final boolean promo) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.promo = promo;
    }

    /**it returns the price**/
    public int getPrice() {
        return price;
    }
    /**it returns the price**/
    public int getQuantity() {
        return quantity;
    }
    /**it returns the  name **/
    public String getName() {
        return name;
    }
    /**it returns the unit **/
    public String getUnit() {
        return unit;
    }
    /**it returns true is it has promo **/
    public boolean doesHavePromo() {
        return promo;
    }

}

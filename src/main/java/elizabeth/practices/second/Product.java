package elizabeth.practices.second;

public class Product {
    public static final int VALUE = 10;
    private String name;
    private int price;
    private int quantity;
    private int quantityProm;
    private String unit;
    private boolean promotion;
    private int discount;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
        this.promotion = false;
        quantityProm = VALUE;
        discount = VALUE;
    }
    public Product(final String name, final int price, final int quantity, final String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.promotion = false;
        quantityProm = VALUE;
        discount = VALUE;
    }

    /**
     *
     * @return int getPrice
     */
    public int getPrice() {
        return price;
    }

    /**
     *
     * @return String getName
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return String getName
     */
    public void setPrice(final int price) {
        this.price = price;
    }

    /**
     *
     * @Method void getName
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     *
     * @return int getQuantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @Method void setQuantity
     */
    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return int getTotalCostProduct
     */
    public int getTotalCostProduct() {
        int costTotal = quantity * price;
        if (isPromotion()) {
            costTotal = costTotal - (costTotal / discount);
        }
        return costTotal;
    }

    /**
     *
     * @Method void setUnit
     */
    public void setUnit(final String unit) {
        this.unit = unit;
    }

    /**
     *
     * @Method String getUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     *
     * @Method void setPromotion
     */
    public void setPromotion(final boolean promotion) {
        this.promotion = promotion;
    }

    /**
     *
     * @return int getQuantityProm
     */
    public int getQuantityProm() {
        return quantityProm;
    }

    /**
     *
     * @Method void setQuantityProm
     */
    public void setQuantityProm(final int quantityProm) {
        this.quantityProm = quantityProm;
    }

    /**
     *
     * @return boolean isPromotion
     */
    public boolean isPromotion() {
        return promotion;
    }

    /**
     *
     * @Method void verifyPromotion
     */
    public void verifyPromotion() {
        if (quantity >= quantityProm) {
            setPromotion(true);
        }
    }
}

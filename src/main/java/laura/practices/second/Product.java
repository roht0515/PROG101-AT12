package laura.practices.second;

public class Product {
    private String name;
    private int price;
    private int quantity;
    public static final int QUANTITY_PRODUCT = 10;
    public static final int QUANTITY_MILK = 5;
    public static final int QUANTITY_RICE = 20;
    public static final int COST_BREAD = 9;
    public static final int COST_MILK = 45;
    public static final int COST = 90;

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
        int total = 0;
        total = quantity * price;
        if (isPromo(this.name)) {
            switch (this.name) {
                case "bread":
                    if (quantity == QUANTITY_PRODUCT) {
                        total = COST_BREAD;
                    }
                    break;
                case "milk":
                    if (quantity == QUANTITY_MILK) {
                        total = COST_MILK;
                    }
                    break;
                case "oil":
                    if (quantity == QUANTITY_PRODUCT) {
                        total = COST;
                    }
                    break;
                case "rice":
                    if (quantity == QUANTITY_RICE) {
                        total = COST;
                    }
                    break;
                default:
                    break;
            }
        }
        return total;
    }

    /**
     * @return string getUnit
     */
    public String getUnit() {
        String unit = "";
        switch (getName()) {
            case "bread":
                unit = "u";
            break;
            case "milk":
                unit = "lt";
            break;
            case "rice":
                unit = "kg";
            break;
            default:
                unit = "u";
            break;
        }
        return unit;
    }

    /**
     * @return boolean isPromo
     */
    public boolean isPromo(final String nameProduct) {
        return (nameProduct == "bread" || nameProduct == "milk"
        || nameProduct == "oil" || nameProduct == "rice");
    }
}

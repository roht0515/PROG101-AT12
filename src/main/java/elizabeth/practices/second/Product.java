package elizabeth.practices.second;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private int quantityProm = 10;
    private String unit;
    private boolean promotion;
    private int discount = 10;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
        this.promotion = false;
    }
    public Product(String name, int price,int quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.promotion = false;

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalCostProduct() {
        int costTotal = quantity * price;
        if (isPromotion()) {
            costTotal = costTotal - (costTotal/discount);
        }
        return costTotal;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public int getQuantityProm() {
        return quantityProm;
    }

    public void setQuantityProm(int quantityProm) {
        this.quantityProm = quantityProm;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void verifyPromotion() {
        if (quantity >= quantityProm) {
            setPromotion(true);
        }
    }
}

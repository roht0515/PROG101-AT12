package laura.practices.second;

public class Product {
    private String name;
    private int price;
    private int quantity;

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
        total = quantity*price;
        if (isPromo(this.name)){
            switch (this.name) {
                case "bread":
                    if(quantity == 10){
                        total = 9;
                    }
                    break;
                case "milk":
                    if(quantity == 5){
                        total = 45;
                    }
                    break;
                case "oil":
                    if(quantity == 10){
                        total = 90;
                    }
                    break;
                case "rice":
                    if(quantity == 20){
                        total = 90;
                    }
                    break;
            
                default:
                    
                    break;
            }
        }
        return total;
    }

    /**
     * @return 
     */
    public String getUnit(){
        String unit = "";
        switch (getName()){
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
    public boolean isPromo(String nameProduct){
        return (nameProduct == "bread" || nameProduct == "milk" || 
                nameProduct == "oil" || nameProduct == "rice");
    }
}

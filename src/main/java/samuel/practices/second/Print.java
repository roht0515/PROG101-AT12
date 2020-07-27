package samuel.practices.second;

public class Print {
    static final String DELIMITER = "-";
    static final String DOLLAR = "$";
    /**
     *
     * @return String body of the invoice Second Step
     */
    public String getPrintBasicModel(final Product product) {
        return String.format("%-7s %-7s %s%d\n", product.getName(),  DELIMITER, DOLLAR, product.getPrice());
    }
    /**
     *
     * @return String total of the invoice Second Step
     */
    public String getPrintTotal(final int total) {
        String footer = "--------------------\n";
        footer = footer + String.format("TOTAL %13s\n", DOLLAR + total);
        return footer;

    }
    /**
     *
     * @return String header of the invoice Second and Third Step
     */
    public String getLineBasicWhitQuantityHeader() {
        String header = "Cant   Product    Price    Total" + "\n";
        header = header + "--------------------------------" + "\n";
        return header;
    }
    /**
     *
     * @return String total of the invoice Third Step
     */
    public String getLineBasicWhitQuantityTotal(final int total) {
        String header = "--------------------------------" + "\n";
        header = header + String.format("TOTAL %24s\n", DOLLAR + total);
        return header;
    }
    /**
     *
     * @return String body of the invoice Third Step
     */
    public String getPrintModelWithQuantity(final Product product) {
        return String.format("%d %-4s %-5s %-3s %s%-7d %s%d\n", product.getCant(),  DELIMITER, product.getName(),  DELIMITER, DOLLAR, product.getPrice(), DOLLAR, product.getTotal());
    }
    /**
     *
     * @return String body of the invoice Fourth Step
     */
    public String getPrintModelWithQuantityUnit(final Product product) {
        return String.format("%d %-2s %-2s %-6s %-3s %s%-7d %s%d\n", product.getCant(), product.getUnit(), DELIMITER, product.getName(),  DELIMITER, DOLLAR, product.getPrice(), DOLLAR, product.getTotal());
    }
    /**
     *
     * @return String header of the invoice Fifth Step
     */
    public String getLineWhitQuantityDiscountHeader() {
        String   header = "Cant   Product  Price  Discount  Total"   + "\n";
        header = header + "----------------------------------------" + "\n";
        return header;
    }
    /**
     *
     * @return String total of the invoice Fifth Step
     */
    public String getLineWhitQuantityTotalDiscount(final int total) {
        String header = "----------------------------------------" + "\n";
        header = header + String.format("TOTAL %30s\n", DOLLAR + total);
        return header;
    }
    /**
     *
     * @return String body of the invoice Fifth Step
     */
    public String getPrintModelWithQuantityUnitDiscount(final Product product) {
        return String.format("%2d %-2s %-1s %-7s %-6s %-9s %s\n", product.getCant(), product.getUnit(), DELIMITER, product.getName(), DOLLAR + product.getPrice(), DOLLAR + product.getDiscount(), DOLLAR + product.getTotal());
    }

}

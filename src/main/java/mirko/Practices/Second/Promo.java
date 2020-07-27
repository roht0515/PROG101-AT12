public class Promo {

    private String name;
    private int cant;
    private int newTotalPrice;

    public Promo(final String name, final int cant, final int newTotalPrice) {
        this.name = name;
        this.cant = cant;
        this.newTotalPrice = newTotalPrice;
    }
    /**
    *
    * @return New Total Price
    */
    public int getNewTotalPrice() {
        return newTotalPrice;
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
}

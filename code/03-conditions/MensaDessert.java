// @run
/** The price of a Mensa meal, with or without dessert. */
public class MensaDessert {
    public static void main(String[] args) {
        boolean withDessert = true;
        // region price
        int priceInCents = 320 + (withDessert ? 90 : 0);
        // endregion
        System.out.println(priceInCents + " cents");
    }
}

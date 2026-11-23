// @run
/** A method changes an int parameter, another one the elements of an array parameter. */
public class PriceRise {
    // region rise
    public static void raise(int price, int cents) {
        price = price + cents;
    }

    public static void raiseAll(int[] prices, int cents) {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = prices[i] + cents;
        }
    }
    // endregion

    public static void main(String[] args) {
        // region main
        int soup = 120;
        int[] menu = {390, 275, 420};
        raise(soup, 20);
        raiseAll(menu, 20);
        System.out.println(soup);
        System.out.println(menu[0]);
        // endregion
    }
}

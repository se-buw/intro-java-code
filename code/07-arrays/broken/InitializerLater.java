/** An array initializer is only allowed in a declaration. */
public class InitializerLater {
    public static void main(String[] args) {
        int[] prices;
        prices = {350, 275, 420, 310, 295};
        System.out.println(prices.length);
    }
}

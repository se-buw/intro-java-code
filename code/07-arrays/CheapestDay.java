// @run
/** Finds the day with the cheapest Mensa meal by remembering its index. */
public class CheapestDay {
    public static void main(String[] args) {
        // region loop
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        int[] prices = {350, 275, 420, 310, 295};  // cents
        int cheapest = 0;  // index of the cheapest day so far
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[cheapest]) {
                cheapest = i;
            }
        }
        System.out.println("Cheapest: " + days[cheapest]
                + ", " + prices[cheapest] + " cents");
        // endregion
    }
}

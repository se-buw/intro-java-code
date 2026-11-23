// @run
import java.util.Arrays;

/** Sorts the Mensa prices of a week with selection sort, cheapest first. */
public class SelectionSort {
    // region sort
    public static void sortPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            // find the cheapest price in prices[i..length-1]
            int cheapest = i;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[cheapest]) {
                    cheapest = j;
                }
            }
            // swap it to position i; then prices[0..i] is sorted
            int temp = prices[i];
            prices[i] = prices[cheapest];
            prices[cheapest] = temp;
        }
    }
    // endregion

    public static void main(String[] args) {
        // region main
        int[] prices = {350, 275, 420, 310, 295};  // cents
        sortPrices(prices);
        System.out.println(Arrays.toString(prices));
        // endregion
    }
}

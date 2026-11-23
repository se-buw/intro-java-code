// @run
import java.util.Arrays;

/** Copies an array element by element. */
public class CopyLoop {
    public static void main(String[] args) {
        // region copy
        int[] prices = {350, 275, 420, 310, 295};
        int[] backup = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            backup[i] = prices[i];
        }
        prices[0] = 390;  // the backup stays unchanged
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(backup));
        // endregion
    }
}

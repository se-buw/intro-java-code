import java.util.Arrays;
import java.util.Scanner;

/** Reads the Mensa prices (in cents) of one week into an array. */
public class ReadPrices {
    public static void main(String[] args) {
        // region read
        Scanner input = new Scanner(System.in);
        int[] prices = new int[5];
        System.out.print("Prices Mon-Fri: ");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(prices));
        // endregion
    }
}

// @run
import java.util.Arrays;

/** A method that creates and returns a new array: Mensa prices in euros. */
public class ToEuros {
    // region convert
    public static double[] toEuros(int[] cents) {
        double[] euros = new double[cents.length];
        for (int i = 0; i < cents.length; i++) {
            euros[i] = cents[i] / 100.0;
        }
        return euros;
    }

    public static void main(String[] args) {
        int[] prices = {390, 275, 420};
        double[] menu = toEuros(prices);
        System.out.println(Arrays.toString(menu));
    }
    // endregion
}

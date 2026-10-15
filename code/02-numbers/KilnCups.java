// @run
/** How many cups from the pottery kiln can be sold? */
public class KilnCups {
    public static void main(String[] args) {
        // region kiln
        int cupsPerFiring = 24;
        int firings = 3;
        int cups = cupsPerFiring * firings;
        cups = cups - 5;   // cracked in the kiln

        System.out.println("Cups for sale: " + cups);
        // endregion
    }
}

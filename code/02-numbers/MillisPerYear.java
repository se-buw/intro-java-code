// @run
/** How many milliseconds does a year have? */
public class MillisPerYear {
    public static void main(String[] args) {
        // region millis
        int millisPerDay = 24 * 60 * 60 * 1000;
        int millisPerYear = 365 * millisPerDay;
        System.out.println(millisPerDay);
        System.out.println(millisPerYear);

        int largest = 2_147_483_647;
        System.out.println(largest + 1);
        // endregion
    }
}

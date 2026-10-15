// @run
// @expect-exception
/** Math.multiplyExact reports an overflow instead of hiding it. */
public class MultiplyExact {
    public static void main(String[] args) {
        // region exact
        int millisPerDay = 24 * 60 * 60 * 1000;
        int millisPerYear = Math.multiplyExact(365, millisPerDay);
        System.out.println(millisPerYear);
        // endregion
    }
}

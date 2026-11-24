/** Ways to declare and create arrays for the Mensa week. */
public class Declarations {
    public static void main(String[] args) {
        // region declare
        int weekdays = 5;
        int[] meals = new int[weekdays];          // 5 ints, size computed at run time
        int[] semester = new int[14 * weekdays];  // 70 ints: a whole semester
        String[] days;                            // only a variable: no array yet
        days = new String[weekdays];              // now an array of 5 Strings

        int[] prices, discounts;                  // two array variables
        int sold[], max;                          // C notation: max is a plain int!
        // endregion
    }
}

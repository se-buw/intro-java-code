// @run
/** How many seconds are 100 years of Bauhaus, from 1919 to 2019? */
public class CentenarySeconds {
    public static void main(String[] args) {
        // region seconds
        int days = 100 * 365 + 25;  // 25 leap days
        long seconds = days * 86_400L;

        System.out.println(days + " days");
        System.out.println(seconds + " seconds");
        System.out.println(Integer.MAX_VALUE);
        // endregion
    }
}

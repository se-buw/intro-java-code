// @run
/** Braces around a single statement are optional, but recommended. */
public class BracesOptional {
    public static void main(String[] args) {
        int points = 76;
        // region braces
        if (points >= 50) {
            System.out.println("Passed.");
        }
        // endregion
        // region nobraces
        if (points >= 50)
            System.out.println("Passed.");
        // endregion
    }
}

// @run
/** A long and a short way to write the same boolean logic. */
public class BooleanStyle {
    public static void main(String[] args) {
        int points = 76;
        // region long
        boolean passed;
        if (points >= 50) {
            passed = true;
        } else {
            passed = false;
        }
        if (passed == true) {
            System.out.println("Passed.");
        }
        // endregion
        // region short
        boolean hasPassed = points >= 50;
        if (hasPassed) {
            System.out.println("Passed.");
        }
        // endregion
    }
}

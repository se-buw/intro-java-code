// @run
/** The indentation suggests a block, but without braces only the first statement belongs to the if. */
public class MisleadingIndent {
    public static void main(String[] args) {
        int points = 30;
        // region if
        if (points >= 50)
            System.out.println("Passed.");
            System.out.println("Thank you.");
        // endregion
    }
}

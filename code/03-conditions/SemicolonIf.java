// @run
/** A stray semicolon after the condition of an if statement. */
public class SemicolonIf {
    @SuppressWarnings("empty")
    public static void main(String[] args) {
        // region if
        int points = 35;
        if (points >= 50); {
            System.out.println("Passed!");
        }
        // endregion
    }
}

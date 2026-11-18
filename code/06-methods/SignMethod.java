// @run
/** Prints three door signs with one method. */
public class SignMethod {
    // region method
    /** Prints a text in a frame. */
    public static void printSign(String text) {
        String bar = "-".repeat(text.length() + 2);
        System.out.println("+" + bar + "+");
        System.out.println("| " + text + " |");
        System.out.println("+" + bar + "+");
    }

    public static void main(String[] args) {
        printSign("weaving");
        printSign("pottery");
        printSign("metal");
    }
    // endregion
}

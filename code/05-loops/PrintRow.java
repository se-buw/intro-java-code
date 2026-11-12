// @run
/** Prints one row of alternating tiles. */
public class PrintRow {
    public static void main(String[] args) {
        // region loop
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.print("#");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        // endregion
    }
}

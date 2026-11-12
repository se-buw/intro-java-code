// @run
/** while checks first, do-while runs its body at least once. */
public class EmptyKiln {
    public static void main(String[] args) {
        // region loop
        int pieces = 0;  // the kiln is empty
        while (pieces > 0) {
            System.out.println("while fires " + pieces);
            pieces = 0;
        }
        do {
            System.out.println("do-while fires " + pieces);
            pieces = 0;
        } while (pieces > 0);
        // endregion
    }
}

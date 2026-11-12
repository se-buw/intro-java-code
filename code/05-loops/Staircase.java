// @run
/** A staircase: the inner loop depends on the outer loop. */
public class Staircase {
    public static void main(String[] args) {
        // region loop
        for (int step = 1; step <= 5; step++) {
            for (int k = 0; k < step; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // endregion
    }
}

// @run
/** A tiling of 4 rows and 8 columns, built with nested loops. */
public class Checkerboard {
    public static void main(String[] args) {
        // region loop
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        // endregion
    }
}

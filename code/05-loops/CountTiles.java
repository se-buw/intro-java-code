// @run
/** Places five tiles in a row, one after the other. */
public class CountTiles {
    public static void main(String[] args) {
        // region loop
        int count = 0;
        while (count < 5) {
            System.out.println("Tile " + count);
            count++;
        }
        // endregion
        System.out.println("Done");
    }
}

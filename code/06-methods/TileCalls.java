// @run
/** A call of a value-returning method is an expression. */
public class TileCalls {
    public static void main(String[] args) {
        int wall = 250;
        int width = 30;
        // region calls
        int needed = tiles(wall, width);
        System.out.println(tiles(250, 30));
        int forTwoWalls = 2 * tiles(250, 30);
        // endregion
        System.out.println(needed + " " + forTwoWalls);
    }

    public static int tiles(int length, int tile) {
        int count = length / tile;
        if (length % tile != 0) {
            count++;
        }
        return count;
    }
}

// @run
/** Calls a method that computes how many tiles cover a wall. */
public class TileCount {
    // region all
    public static void main(String[] args) {
        int wall = 250;
        int width = 30;
        int needed = tiles(wall, width);
        System.out.println("Tiles for the wall: " + needed);
    }

    public static int tiles(int length, int tile) {
        int count = length / tile;
        if (length % tile != 0) {
            count++;  // one cut tile at the end
        }
        return count;
    }
    // endregion
}

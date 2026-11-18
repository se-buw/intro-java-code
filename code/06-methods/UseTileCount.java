// @run
/** Calls the tiles method of another class, and Math.ceilDiv. */
public class UseTileCount {
    public static void main(String[] args) {
        // region call
        int count = TileCount.tiles(420, 30);
        System.out.println("Tiles for 420 cm: " + count);
        System.out.println("With Math: " + Math.ceilDiv(420, 30));
        // endregion
    }
}

// @run
/** Which overloaded method does the compiler choose? */
public class WhichTiles {
    // region quiz
    public static int tiles(int length, int tile) {
        return (length + tile - 1) / tile;
    }

    public static double tiles(double len, double tile) {
        return Math.ceil(len / tile);
    }

    public static void main(String[] args) {
        System.out.println(tiles(250, 30));
        System.out.println(tiles(250, 30.0));
        System.out.println(tiles(250L, 30));
    }
    // endregion
}

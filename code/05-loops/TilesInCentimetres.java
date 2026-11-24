// @run
/** Measured in whole centimetres, the tile loop is exact. */
public class TilesInCentimetres {
    public static void main(String[] args) {
        // region loop
        int coveredCm = 0;
        while (coveredCm < 100) {
            coveredCm += 10;  // a 10 cm tile
        }
        // endregion
        System.out.println(coveredCm);
    }
}

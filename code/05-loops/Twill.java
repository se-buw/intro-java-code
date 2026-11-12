// @run
/** Draws a twill: warp on top in some cells, weft in the others, shifted by one per row. */
public class Twill {
    public static void main(String[] args) {
        // region loop
        int over = 2;
        int under = 2;
        int period = over + under;
        for (int row = 0; row < 6; row++) {
            String line = "";
            for (int thread = 0; thread < 16; thread++) {
                if ((thread + row) % period < over) {
                    line = line + "#";  // warp on top
                } else {
                    line = line + ".";  // weft on top
                }
            }
            System.out.println(line);
        }
        // endregion
    }
}

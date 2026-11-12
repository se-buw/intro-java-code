/** Never run this: the loop does not terminate. */
public class FloatCondition {
    public static void main(String[] args) {
        // region loop
        double covered = 0.0;  // metres
        while (covered != 1.0) {
            covered += 0.1;    // a 10 cm tile
        }
        // endregion
    }
}

// @run
import java.util.Arrays;

/** Weaves a row of threads back from its runs: two parallel arrays. */
public class WeaveFromRuns {
    public static void main(String[] args) {
        // region weave
        int[] counts = {4, 2, 6, 2, 4};
        char[] colours = {'R', 'Y', 'B', 'Y', 'R'};
        int length = 0;
        for (int count : counts) {
            length += count;
        }
        char[] row = new char[length];
        int pos = 0;
        for (int r = 0; r < counts.length; r++) {
            Arrays.fill(row, pos, pos + counts[r], colours[r]);
            pos += counts[r];
        }
        System.out.println(new String(row));
        // endregion
    }
}

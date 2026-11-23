// @run
/** Describes one row of a woven pattern as runs of equal colours. */
public class WeaveRuns {
    public static void main(String[] args) {
        // region runs
        char[] row = "RRRRYYBBBBBBYYRRRR".toCharArray();
        int start = 0;  // first thread of the current run
        for (int i = 1; i <= row.length; i++) {
            if (i == row.length || row[i] != row[start]) {
                System.out.print((i - start) + "" + row[start] + " ");
                start = i;  // a new run begins at i
            }
        }
        System.out.println();
        // endregion
    }
}

// @run
/** A semicolon too many: the loop body is empty. */
public class ExtraSemicolon {
    public static void main(String[] args) {
        // region loop
        int warp = 0;  // threads on the loom
        for (int bundle = 1; bundle <= 4; bundle++);
        {
            warp = warp + 12;  // 12 threads per bundle
        }
        System.out.println(warp + " threads");
        // endregion
    }
}

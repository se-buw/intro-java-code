// @run
/** Halves an A0 sheet until its long side is at most 160 mm. */
public class PaperFormat {
    public static void main(String[] args) {
        // region loop
        int longer = 1189;  // A0 in mm
        int shorter = 841;
        int format = 0;
        while (longer > 160) {
            int half = longer / 2;  // cut the long side in half
            longer = shorter;
            shorter = half;
            format++;
            System.out.printf("A%d: %d x %d%n", format, longer, shorter);
        }
        // endregion
        System.out.println("A" + format + " fits into a coat pocket.");
    }
}

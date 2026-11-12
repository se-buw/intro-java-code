// @run
/** Adds up the width of 1000 threads of 0.1 mm, with float and with double. */
public class ThreadWidth {
    public static void main(String[] args) {
        // region loop
        float widthFloat = 0;
        double widthDouble = 0;
        for (int k = 0; k < 1000; k++) {  // int counter: exactly 1000 steps
            widthFloat += 0.1f;
            widthDouble += 0.1;
        }
        // endregion
        System.out.println("float:  " + widthFloat + " mm");
        System.out.println("double: " + widthDouble + " mm");
        System.out.println("exact:  100.0 mm");
    }
}

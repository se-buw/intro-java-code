// @run
/** Computes factorials with a recursive method. */
public class Factorial {
    // region factorial
    /** Returns n! for n >= 0. */
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 5; n++) {
            System.out.println(n + "! = " + factorial(n));
        }
    }
    // endregion
}

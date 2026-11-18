// @run
/** Factorials grow fast: when does long overflow? */
public class BigFactorial {
    // region quiz
    public static long factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(20));
        System.out.println(factorial(21));
        System.out.println(Long.MAX_VALUE);
    }
    // endregion
}

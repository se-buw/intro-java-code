// @run
/** Two ways to test whether a number is odd. */
public class OddTest {
    public static void main(String[] args) {
        // region odd
        int a = 7;
        int b = -7;
        System.out.println(a % 2 == 1);
        System.out.println(b % 2 == 1);
        System.out.println(b % 2 != 0);
        // endregion
    }
}

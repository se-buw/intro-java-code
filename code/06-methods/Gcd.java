// @run
/** Greatest common divisor with Euclid's algorithm. */
public class Gcd {
    // region gcd
    /** Returns the gcd of a and b; both must be >= 0. */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("gcd(360, 270) = " + gcd(360, 270));
        System.out.println("gcd(17, 5) = " + gcd(17, 5));
        System.out.println("gcd(0, 5) = " + gcd(0, 5));
    }
    // endregion
}

// @run
/** Scopes of a parameter and of local variables. */
public class ScopeDemo {
    // region scope
    public static void printSums(int n) {
        int squares = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            squares += square;
        }
        int cubes = 0;
        for (int i = 1; i <= n; i++) {
            cubes += i * i * i;
        }
        System.out.println(squares + " and " + cubes);
    }
    // endregion

    public static void main(String[] args) {
        int n = 3;
        printSums(n);
    }
}

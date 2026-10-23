// @run
/** Nested if-else and the equivalent else-if chain. */
public class BauhausCityNested {
    public static void main(String[] args) {
        int year = 1927;
        // region nested
        if (year >= 1932) {
            System.out.println("Berlin");
        } else {
            if (year >= 1925) {
                System.out.println("Dessau");
            } else {
                if (year >= 1919) {
                    System.out.println("Weimar");
                } else {
                    System.out.println("before");
                }
            }
        }
        // endregion
        // region chain
        if (year >= 1932) {
            System.out.println("Berlin");
        } else if (year >= 1925) {
            System.out.println("Dessau");
        } else if (year >= 1919) {
            System.out.println("Weimar");
        } else {
            System.out.println("before");
        }
        // endregion
    }
}

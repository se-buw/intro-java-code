// @run
/** A sequence of one-way if statements. */
public class BauhausCitySequence {
    public static void main(String[] args) {
        // region if
        int year = 1927;
        if (year >= 1919) {
            System.out.println("Weimar");
        }
        if (year >= 1925) {
            System.out.println("Dessau");
        }
        if (year >= 1932) {
            System.out.println("Berlin");
        }
        // endregion
    }
}

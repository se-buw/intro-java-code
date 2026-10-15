// @run
/** Casting double values to int. */
public class CastQuestion {
    public static void main(String[] args) {
        // region cast
        double price = 2.55;   // Mensa price in EUR
        int cents = (int) (price * 100);
        System.out.println(cents);

        System.out.println((int) 3.99);
        System.out.println((int) -3.99);
        // endregion
    }
}

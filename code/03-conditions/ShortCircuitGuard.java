// @run
/** Short-circuit evaluation protects against a division by zero. */
public class ShortCircuitGuard {
    public static void main(String[] args) {
        // region guard
        int attendees = 0;
        int pizzas = 6;
        if (attendees > 0 && pizzas / attendees >= 1) {
            System.out.println("Pizza for everyone.");
        } else {
            System.out.println("No pizza party.");
        }
        // endregion
    }
}

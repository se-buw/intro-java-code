// @run
/** The balance of a Mensa card changes with every purchase. */
public class MensaCard {
    public static void main(String[] args) {
        // region card
        int balanceInCents = 1000;
        System.out.println("Start: " + balanceInCents);

        balanceInCents = balanceInCents - 320;  // lunch
        System.out.println("Lunch: " + balanceInCents);

        balanceInCents = balanceInCents - 150;  // coffee
        System.out.println("Coffee: " + balanceInCents);
        // endregion
    }
}

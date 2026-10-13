// @run
// @expect-exception
/** Shares the cost of a Mensa visit among friends. */
public class ShareBill {
    public static void main(String[] args) {
        // region main
        int billInCents = 1260;
        int friends = 0;
        System.out.println("Each friend pays (cents):");
        System.out.println(billInCents / friends);
        // endregion
    }
}

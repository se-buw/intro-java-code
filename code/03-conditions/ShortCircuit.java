// @run
/** & and && with a side effect in the right operand: a Mensa stamp card. */
public class ShortCircuit {
    public static void main(String[] args) {
        // region ops
        boolean isMember = false;
        int stamps = 3;
        boolean a = isMember & (stamps-- > 0);
        System.out.println("&:  " + stamps + " " + a);

        stamps = 3;
        boolean b = isMember && (stamps-- > 0);
        System.out.println("&&: " + stamps + " " + b);
        // endregion
    }
}

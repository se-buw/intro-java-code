// @run
/** Two versions of the same conversion from points to millimetres. */
public class TypeSizeQuestion {
    public static void main(String[] args) {
        // region formula
        int points = 12;
        double mm1 = points / 72 * 25.4;
        double mm2 = points / 72.0 * 25.4;
        System.out.println(mm1);
        System.out.println(mm2);
        // endregion
    }
}

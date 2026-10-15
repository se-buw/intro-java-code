// @run
// @expect-exception
/** Integer division by zero. */
public class DivideByZero {
    public static void main(String[] args) {
        // region zero
        int students = 0;
        int cookies = 30;
        System.out.println(cookies / students);
        // endregion
    }
}

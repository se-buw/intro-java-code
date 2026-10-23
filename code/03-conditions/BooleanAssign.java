// @run
/** Chooses the Mensa price. */
public class BooleanAssign {
    public static void main(String[] args) {
        // region if
        boolean isStudent = false;
        if (isStudent = true) {
            System.out.println("Student price");
        } else {
            System.out.println("Guest price");
        }
        // endregion
    }
}

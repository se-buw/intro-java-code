// @run
/** Braces say which if the else belongs to. */
public class DanglingElseFixed {
    public static void main(String[] args) {
        // region if
        boolean isStudent = false;
        boolean hasMensaCard = true;

        if (isStudent) {
            if (hasMensaCard) {
                System.out.println("Student price");
            }
        } else {
            System.out.println("Guest price");
        }
        // endregion
    }
}

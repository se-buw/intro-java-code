// @run
/** Which if does the else belong to? */
public class DanglingElse {
    public static void main(String[] args) {
        // region if
        boolean isStudent = false;
        boolean hasMensaCard = true;

        if (isStudent)
            if (hasMensaCard)
                System.out.println("Student price");
        else
            System.out.println("Guest price");

        System.out.println("Next, please!");
        // endregion
    }
}

// @run
/** The conditional operator ?: chooses one of two values. */
public class ConditionalOperator {
    public static void main(String[] args) {
        boolean isStudent = true;
        // region if
        int price;
        if (isStudent) {
            price = 320;
        } else {
            price = 640;
        }
        // endregion
        // region cond
        int priceInCents = isStudent ? 320 : 640;
        // endregion
        System.out.println(price + " " + priceInCents);
        // region print
        int students = 1;
        String noun = students == 1 ? "student" : "students";
        System.out.println(students + " " + noun);
        // endregion
    }
}

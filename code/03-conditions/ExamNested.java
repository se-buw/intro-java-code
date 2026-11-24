// @run
/** A nested if: "Passed." only for students who are not excellent. */
public class ExamNested {
    public static void main(String[] args) {
        int points = 75;
        // region nested
        if (points >= 95) {
            System.out.println("Excellent!");
        } else {
            if (points >= 50) {
                System.out.println("Passed.");
            }
        }
        System.out.println("Thank you.");
        // endregion
    }
}

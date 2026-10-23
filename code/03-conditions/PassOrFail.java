// @run
/** A two-way if statement: passed or failed. */
public class PassOrFail {
    public static void main(String[] args) {
        // region if
        double grade = 4.3;
        if (grade <= 4.0) {
            System.out.println("Passed with " + grade);
        } else {
            System.out.println("Failed with " + grade);
            System.out.println("Resit next semester.");
        }
        // endregion
    }
}

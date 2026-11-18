// @run
/** A void method: prints one line of a result list. */
public class PrintResult {
    // region void
    public static void printResult(String name, double grade) {
        if (grade < 1.0 || grade > 5.0) {
            System.out.println(name + ": invalid grade");
            return;
        }
        String text = grade <= 4.0 ? "passed" : "failed";
        System.out.printf("%s: %.1f %s%n", name, grade, text);
    }

    public static void main(String[] args) {
        printResult("Gropius", 1.7);
        printResult("Itten", 5.0);
        printResult("Klee", 0.7);
    }
    // endregion
}

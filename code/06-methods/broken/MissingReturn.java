/** Every path through a value-returning method needs a return. */
public class MissingReturn {
    public static String result(double grade) {
        if (grade <= 4.0) {
            return "passed";
        } else if (grade > 4.0) {
            return "failed";
        }
    }
}

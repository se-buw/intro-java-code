// @run
// @expect-exception
/** Prints the meals sold per weekday, but the loop runs one step too far. */
public class MensaWeek {
    public static void main(String[] args) {
        // region loop
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        int[] meals = {820, 640, 960, 510, 640};
        for (int i = 0; i <= meals.length; i++) {
            System.out.println(days[i] + ": " + meals[i]);
        }
        // endregion
    }
}

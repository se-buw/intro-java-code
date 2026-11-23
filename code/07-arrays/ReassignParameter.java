// @run
import java.util.Arrays;

/** Assigning a new array to a parameter does not change the variable of the caller. */
public class ReassignParameter {
    // region reassign
    public static void main(String[] args) {
        int[] meals = {820, 1140, 960, 1210, 640};
        newWeek(meals);
        System.out.println(Arrays.toString(meals));
    }

    public static void newWeek(int[] counts) {
        counts = new int[5];  // a new, empty week
        counts[0] = 15;       // meals on Monday
    }
    // endregion
}

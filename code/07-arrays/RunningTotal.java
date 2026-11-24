// @run
import java.util.Arrays;

/** Running total of the meals the Mensa sold, Monday to Friday. */
public class RunningTotal {
    public static void main(String[] args) {
        // region loop
        int[] meals = {820, 640, 960, 510, 640};
        int[] total = new int[meals.length];
        total[0] = meals[0];
        for (int i = 1; i < meals.length; i++) {
            total[i] = total[i - 1] + meals[i];
        }
        System.out.println(Arrays.toString(total));
        // endregion
    }
}

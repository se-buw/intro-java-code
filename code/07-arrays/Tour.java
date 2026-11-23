// @run
import java.util.Arrays;

/** A helper method that swaps two elements of an array: the order of a workshop tour. */
public class Tour {
    // region swap
    public static void swap(String[] order, int i, int j) {
        String temp = order[i];
        order[i] = order[j];
        order[j] = temp;
    }
    // endregion

    public static void main(String[] args) {
        // region main
        String[] tour = {"Metal", "Weaving", "Stage"};
        swap(tour, 0, 2);  // start on the stage
        System.out.println(Arrays.toString(tour));
        // endregion
    }
}

// @run
import java.util.Arrays;

/** Two array variables can refer to the same array. */
public class Aliasing {
    public static void main(String[] args) {
        // region alias
        int[] menu = {390, 275, 420};  // prices in cents
        int[] special = {350, 240, 380};
        special = menu;  // copies the reference
        special[0] = 360;
        System.out.println(Arrays.toString(menu));
        System.out.println(Arrays.toString(special));
        System.out.println(menu == special);
        // endregion
    }
}

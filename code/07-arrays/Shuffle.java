// @run
import java.util.Arrays;
import java.util.Random;

/** Draws the order of the master presentations with the Fisher-Yates algorithm. */
public class Shuffle {
    public static void main(String[] args) {
        // region shuffle
        String[] masters = {"Itten", "Klee", "Kandinsky", "Albers", "Schlemmer"};
        Random random = new Random(2026);
        for (int i = masters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);  // 0 to i
            String temp = masters[i];       // swap i and j
            masters[i] = masters[j];
            masters[j] = temp;
        }
        System.out.println(Arrays.toString(masters));
        // endregion
    }
}

// @run
import java.util.Random;

/** Random numbers in a range, reproducible with a seed. */
public class RandomNumbers {
    public static void main(String[] args) {
        // region random
        Random random = new Random(1919);  // seed
        int dice = random.nextInt(1, 7);    // 1 to 6
        int red = random.nextInt(256);      // 0 to 255
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        double x = random.nextDouble();     // [0.0, 1.0)
        System.out.println("Dice: " + dice);
        System.out.println("RGB:  " + red + " " + green
                + " " + blue);
        System.out.println("x:    " + x);
        // endregion
    }
}

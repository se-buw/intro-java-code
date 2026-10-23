// @run
import java.util.Random;

/** Random numbers from a seeded generator. */
public class Dice {
    public static void main(String[] args) {
        // region random
        Random random = new Random(42);  // seed 42

        int die1 = random.nextInt(1, 7);  // 1..6
        int die2 = random.nextInt(1, 7);
        int digit = random.nextInt(10);   // 0..9
        boolean heads = random.nextBoolean();
        double x = random.nextDouble();   // [0, 1)

        System.out.println(die1 + " " + die2 + " "
                + digit + " " + heads);
        System.out.println(x);
        // endregion
    }
}

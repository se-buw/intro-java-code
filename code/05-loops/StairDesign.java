import java.util.Scanner;

/** Lists step counts for a staircase whose rise is comfortable. */
public class StairDesign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Floor-to-floor height in mm: ");
        int height = input.nextInt();

        // region loop
        for (int steps = 10; steps <= 25; steps++) {
            double rise = (double) height / steps;
            if (rise >= 160 && rise <= 190) {
                double tread = 630 - 2 * rise;  // 2 rises + 1 tread = 630
                System.out.printf("%d steps: rise %.0f, tread %.0f mm%n",
                        steps, rise, tread);
            }
        }
        // endregion
    }
}

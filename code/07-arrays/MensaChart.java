import java.util.Scanner;

/** Reads the meals sold per weekday and draws a bar chart scaled to the busiest day. */
public class MensaChart {
    public static void main(String[] args) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        Scanner input = new Scanner(System.in);
        // region read
        int[] meals = new int[days.length];
        int max = 0;
        System.out.print("Meals Mon-Fri: ");
        for (int i = 0; i < meals.length; i++) {
            meals[i] = input.nextInt();
            max = Math.max(max, meals[i]);
        }
        if (max == 0) {
            System.out.println("Nothing sold.");
            return;
        }
        // endregion
        // region chart
        final int width = 30;  // characters for the busiest day
        for (int i = 0; i < meals.length; i++) {
            String bar = "#".repeat(meals[i] * width / max);
            System.out.println(days[i] + " " + meals[i] + " " + bar);
        }
        // endregion
    }
}

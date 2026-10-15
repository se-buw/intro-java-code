import java.util.Scanner;

/** Converts time spent at the loom from hours and minutes to minutes. */
public class LoomMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region time
        System.out.print("Time at the loom (h min): ");
        int hours = input.nextInt();
        int minutes = input.nextInt();

        int total = 60 * hours + minutes;
        System.out.println("That is " + total + " minutes");
        // endregion
    }
}

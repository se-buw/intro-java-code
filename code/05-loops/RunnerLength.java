import java.util.Scanner;

/** Counts the days until a woven runner reaches its planned length. */
public class RunnerLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Planned length: 200 cm");

        // region loop
        int length = 0;  // cm woven so far
        int days = 0;
        while (length < 200) {
            System.out.print("cm on day " + (days + 1) + ": ");
            length += input.nextInt();
            days++;
        }
        // endregion
        System.out.println("Done after " + days + " days: " + length + " cm");
    }
}

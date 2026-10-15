import java.util.Scanner;

/** Do not do this: two Scanner objects for the same input. */
public class TwoScanners {
    public static void main(String[] args) {
        // region two
        Scanner input = new Scanner(System.in);
        System.out.print("Room number: ");
        int room = input.nextInt();

        Scanner keyboard = new Scanner(System.in);  // bad
        System.out.print("Seats: ");
        int seats = keyboard.nextInt();
        // endregion
        System.out.println(room + " " + seats);
    }
}

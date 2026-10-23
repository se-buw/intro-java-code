import java.util.Scanner;

/** Price of the Mensa main dish by status (example prices in cents). */
public class MensaPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region if
        System.out.print("1 = student, 2 = staff, 3 = guest: ");
        int status = input.nextInt();

        if (status == 1) {
            System.out.println("Price: 3.20 EUR");
        } else if (status == 2) {
            System.out.println("Price: 5.10 EUR");
        } else if (status == 3) {
            System.out.println("Price: 6.40 EUR");
        } else {
            System.out.println("Unknown status " + status);
        }
        // endregion
    }
}

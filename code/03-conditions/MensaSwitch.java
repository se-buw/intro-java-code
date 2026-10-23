import java.util.Scanner;

/** Mensa price with a switch statement (example prices). */
public class MensaSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region switch
        System.out.print("1 = student, 2 = staff, 3 = guest: ");
        int status = input.nextInt();

        switch (status) {
            case 1 -> System.out.println("Price: 3.20 EUR");
            case 2 -> System.out.println("Price: 5.10 EUR");
            case 3 -> System.out.println("Price: 6.40 EUR");
            default -> System.out.println("Unknown status " + status);
        }
        // endregion
    }
}

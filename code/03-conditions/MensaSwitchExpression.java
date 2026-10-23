import java.util.Scanner;

/** Mensa price with a switch expression on a String (example prices). */
public class MensaSwitchExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region switch
        System.out.print("Status (student/staff/guest): ");
        String status = input.next();
        int priceInCents = switch (status) {
            case "student" -> 320;
            case "staff" -> 510;
            case "guest" -> 640;
            default -> {
                System.out.println("Unknown status, guest price.");
                yield 640;
            }
        };
        System.out.printf("Price: %d.%02d EUR%n",
                priceInCents / 100, priceInCents % 100);
        // endregion
    }
}

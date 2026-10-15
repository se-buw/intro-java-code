import java.util.Scanner;

/** Computes VAT and gross price in whole cents. */
public class PriceInCents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region cents
        System.out.print("Net price in cents: ");
        int netCents = input.nextInt();
        System.out.print("VAT rate in % (7 or 19): ");
        int vatPercent = input.nextInt();

        int vatCents = (int) Math.round(
                netCents * vatPercent / 100.0);
        int grossCents = netCents + vatCents;

        System.out.println("Gross: " + grossCents / 100
                + " EUR " + grossCents % 100 + " ct");
        // endregion
    }
}

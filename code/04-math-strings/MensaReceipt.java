// @run
/** Prints a Mensa receipt as a table with printf. */
public class MensaReceipt {
    public static void main(String[] args) {
        // region receipt
        double soup = 1.65;
        double dish = 3.90;
        double dessert = 0.95;
        double total = soup + dish + dessert;
        String row = "%-16s%6.2f%n";
        System.out.printf("%-16s%6s%n", "Mensa", "EUR");
        System.out.println("-".repeat(22));
        System.out.printf(row, "Kürbissuppe", soup);
        System.out.printf(row, "Thüringer Klöße", dish);
        System.out.printf(row, "Apfelkompott", dessert);
        System.out.println("-".repeat(22));
        System.out.printf(row, "Total", total);
        // endregion
    }
}

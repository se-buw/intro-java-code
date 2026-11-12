import java.util.Scanner;

/** Adds up the visitors of an exhibition per day until -1 is entered. */
public class VisitorCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Visitors per day, -1 to finish.");

        // region loop
        int days = 0;
        int total = 0;
        System.out.print("Visitors: ");
        int visitors = input.nextInt();
        while (visitors != -1) {  // -1 = sentinel
            total += visitors;
            days++;
            System.out.print("Visitors: ");
            visitors = input.nextInt();
        }
        // endregion
        System.out.println(total + " visitors on " + days + " days");
    }
}

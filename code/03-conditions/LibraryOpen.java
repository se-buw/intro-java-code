import java.util.Scanner;

/** Is the library open? (example opening hours) */
public class LibraryOpen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region open
        System.out.print("Day (1 = Mon, 7 = Sun): ");
        int day = input.nextInt();
        System.out.print("Hour (0-23): ");
        int hour = input.nextInt();
        boolean isWeekday = day >= 1 && day <= 5;
        boolean isSaturday = day == 6;
        boolean isOpen = (isWeekday && hour >= 8)
                || (isSaturday && hour >= 10
                    && hour < 20);
        if (isOpen) {
            System.out.println("Open, enjoy reading.");
        } else {
            System.out.println("Closed.");
        }
        // endregion
    }
}

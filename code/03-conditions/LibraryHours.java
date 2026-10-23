import java.util.Scanner;

/** Opening hours of the library by day of the week (example hours). */
public class LibraryHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region switch
        System.out.print("Day (1 = Mon, 7 = Sun): ");
        int day = input.nextInt();

        String hours = switch (day) {
            case 1, 2, 3, 4, 5 -> "8:00-24:00";
            case 6 -> "10:00-20:00";
            case 7 -> "closed";
            default -> "no such day";
        };
        System.out.println("Library: " + hours);
        // endregion
    }
}

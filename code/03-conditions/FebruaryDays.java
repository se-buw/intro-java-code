import java.util.Scanner;

/** How many days does February have in a given year (Gregorian calendar)? */
public class FebruaryDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region leap
        System.out.print("Year: ");
        int year = input.nextInt();
        boolean isLeapYear = year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0);
        int days = 28;
        if (isLeapYear) {
            days = 29;
        }
        System.out.println("February: " + days + " days");
        // endregion
    }
}

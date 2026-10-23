import java.util.Scanner;

/** Two independent one-way if statements. */
public class ExamPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region if
        System.out.print("Points (0-100): ");
        int points = input.nextInt();

        if (points >= 50) {
            System.out.println("Passed.");
        }
        if (points >= 95) {
            System.out.println("Excellent!");
        }
        System.out.println("Thank you.");
        // endregion
    }
}

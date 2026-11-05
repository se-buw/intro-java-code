// @expect-exception
import java.util.Scanner;

/** Converts the input to an int: fails for "19.19". */
public class ParseYear {
    public static void main(String[] args) {
        // region parse
        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        String text = input.nextLine();
        int year = Integer.parseInt(text);
        System.out.println("100 years later: " + (year + 100));
        // endregion
    }
}

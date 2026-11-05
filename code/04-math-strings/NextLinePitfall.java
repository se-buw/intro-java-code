import java.util.Scanner;

/** Mixing nextInt() and nextLine(). */
public class NextLinePitfall {
    public static void main(String[] args) {
        // region read
        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Founder: ");
        String founder = input.nextLine();
        System.out.println(year + ", founded by [" + founder + "]");
        // endregion
    }
}

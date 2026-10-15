import java.util.Scanner;

/** Converts a type size from points to millimetres (72 pt = 1 inch = 25.4 mm). */
public class PointsToMillimetres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region convert
        System.out.print("Type size in pt: ");
        double points = input.nextDouble();

        double millimetres = points / 72 * 25.4;

        System.out.println(points + " pt = "
                + millimetres + " mm");
        // endregion
    }
}

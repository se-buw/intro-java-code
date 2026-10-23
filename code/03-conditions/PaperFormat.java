import java.util.Scanner;

/** Reads the two sides of a sheet in any order and prints it upright. */
public class PaperFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region swap
        System.out.print("Sides of the sheet (mm): ");
        int width = input.nextInt();
        int height = input.nextInt();

        if (width > height) {  // swap
            int temp = width;
            width = height;
            height = temp;
        }
        System.out.println("Upright: " + width + " x "
                + height + " mm");
        // endregion
    }
}

import java.util.Scanner;

/** How tall is a column of text with a given number of lines? */
public class ColumnHeight {
    public static void main(String[] args) {
        // region input
        Scanner input = new Scanner(System.in);
        System.out.print("Lines of text: ");
        int lines = input.nextInt();
        System.out.print("Spacing in mm: ");
        double spacing = input.nextDouble();
        double height = lines * spacing;
        System.out.println("Height: " + height + " mm");
        // endregion
    }
}

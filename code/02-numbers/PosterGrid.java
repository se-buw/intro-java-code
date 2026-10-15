import java.util.Scanner;

/** Finds the row and column of a field in a poster grid with 4 columns. */
public class PosterGrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region grid
        System.out.print("Field number (from 0): ");
        int field = input.nextInt();

        int row = field / 4;
        int column = field % 4;

        System.out.println("Field " + field + ": row " + row
                + ", column " + column);
        // endregion
    }
}

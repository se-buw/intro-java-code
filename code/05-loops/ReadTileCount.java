import java.util.Scanner;

/** Asks again until the input is in the allowed range. */
public class ReadTileCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // region loop
        int tiles;
        do {
            System.out.print("Tiles per row (1-20): ");
            tiles = input.nextInt();
        } while (tiles < 1 || tiles > 20);
        // endregion
        System.out.println("OK, " + tiles + " tiles per row.");
    }
}

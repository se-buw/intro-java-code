import java.util.Scanner;

/** Does a picture fit on an exhibition wall with free space on both sides? */
public class PictureFits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // region fits
        final int WALL = 300;    // cm
        final int MARGIN = 100;  // free wall on each side
        System.out.print("Width of the picture (cm): ");
        int picture = input.nextInt();

        boolean fits = picture + 2 * MARGIN <= WALL;
        System.out.println("Fits on the wall: " + fits);
        // endregion
    }
}

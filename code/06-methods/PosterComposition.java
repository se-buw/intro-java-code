// @run
/** Prints a poster with the three basic shapes on a grid of characters. */
public class PosterComposition {
    // region main
    public static void main(String[] args) {
        printPoster("bauhaus 1923", 12, 30);
    }

    public static void printPoster(String title, int rows, int cols) {
        printTitle(title, cols);
        printShapes(rows, cols);
    }

    public static void printTitle(String title, int cols) {
        int indent = (cols - title.length()) / 2;
        System.out.println(" ".repeat(indent) + title);
    }
    // endregion

    // region print
    public static void printShapes(int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            printRow(row, cols);
        }
    }

    public static void printRow(int row, int cols) {
        for (int col = 0; col < cols; col++) {
            System.out.print(shapeAt(row, col));
        }
        System.out.println();
    }
    // endregion

    // region shape
    /** The character of one grid cell. */
    public static char shapeAt(int row, int col) {
        if (inCircle(row, col)) {
            return 'o';
        } else if (inTriangle(row, col)) {
            return '^';
        } else if (inSquare(row, col)) {
            return '#';
        }
        return '.';
    }
    // endregion

    // region leaves
    public static boolean inSquare(int row, int col) {
        return row >= 1 && row <= 5 && col >= 2 && col <= 11;
    }

    public static boolean inTriangle(int row, int col) {
        return row <= 11 && Math.abs(col - 7) <= row - 5;
    }

    /** Centre: row 6, column 22. A character is half as wide as high. */
    public static boolean inCircle(int row, int col) {
        return Math.hypot((col - 22) / 2.0, row - 6) < 3.5;
    }
    // endregion
}

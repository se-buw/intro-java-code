// @run
/** Top-down: the structure of the poster program, with stubs. */
public class PosterSkeleton {
    public static void main(String[] args) {
        printPoster("bauhaus 1923", 12, 30);
    }

    // region skeleton
    public static void printPoster(String title, int rows, int cols) {
        printTitle(title, cols);
        printShapes(rows, cols);
    }

    public static void printTitle(String title, int cols) {
        System.out.println("stub: title " + title);
    }

    public static void printShapes(int rows, int cols) {
        System.out.println("stub: " + rows + " rows");
    }
    // endregion
}

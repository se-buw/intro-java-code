// @run
/** Bottom-up: tests the small shape methods before they are used. */
public class PosterTest {
    public static void main(String[] args) {
        // region test
        check("inSquare(1, 2)", PosterComposition.inSquare(1, 2), true);
        check("inSquare(0, 2)", PosterComposition.inSquare(0, 2), false);
        check("inTriangle(5, 7)", PosterComposition.inTriangle(5, 7), true);
        check("inTriangle(5, 8)", PosterComposition.inTriangle(5, 8), false);
        check("inCircle(6, 29)", PosterComposition.inCircle(6, 29), false);
        check("shapeAt(6, 22)", PosterComposition.shapeAt(6, 22), 'o');
        // endregion
    }

    public static void check(String call, boolean actual, boolean expected) {
        System.out.println((actual == expected ? "ok    " : "WRONG ") + call);
    }

    public static void check(String call, char actual, char expected) {
        System.out.println((actual == expected ? "ok    " : "WRONG ") + call);
    }
}

import java.awt.geom.Ellipse2D;

// @run
/** Compares inCircle with the ellipse of java.awt.geom on a large grid. */
public class PosterCheck {
    public static void main(String[] args) {
        // region check
        Ellipse2D circle = new Ellipse2D.Double(15, 2.5, 14, 7);  // x, y, w, h
        int differences = 0;
        for (int row = -10; row <= 30; row++) {
            for (int col = -10; col <= 50; col++) {
                if (PosterComposition.inCircle(row, col) != circle.contains(col, row)) {
                    differences++;
                }
            }
        }
        System.out.println("41 x 61 cells: " + differences + " differences");
        // endregion
    }
}

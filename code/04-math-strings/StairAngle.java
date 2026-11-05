import java.util.Scanner;

/** Computes the slope, length and stride of a flight of stairs. */
public class StairAngle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Rise and tread (cm), number of steps: ");
        // region stairs
        double rise = input.nextDouble();
        double tread = input.nextDouble();
        int steps = input.nextInt();

        double angle = Math.toDegrees(Math.atan(rise / tread));
        double length = Math.hypot(steps * tread, steps * rise);
        double stride = 2 * rise + tread;

        System.out.printf("Slope:  %.1f degrees%n", angle);
        System.out.printf("Length: %.0f cm along the slope%n", length);
        System.out.printf("Stride: %.0f cm (ideal: about 63)%n", stride);
        // endregion
    }
}

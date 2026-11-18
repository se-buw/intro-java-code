// @run
/** Tries to change the caller's colour value inside a method, and fails. */
public class ClampColour {
    // region clamp
    public static int clamp(int value) {
        if (value > 255) {
            value = 255;  // changes only the copy
        }
        return value;
    }

    public static void main(String[] args) {
        int red = 300;
        clamp(red);
        System.out.println("ignored:  " + red);
        red = clamp(red);
        System.out.println("assigned: " + red);
    }
    // endregion
}

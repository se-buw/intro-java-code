// @run
/** Checks colour codes like #E30613 with a method isColourCode. */
public class ColourCode {
    // region check
    public static boolean isColourCode(String code) {
        if (code.length() != 7 || code.charAt(0) != '#') {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (Character.digit(code.charAt(i), 16) < 0) {
                return false;
            }
        }
        return true;
    }
    // endregion

    public static void show(String code) {
        System.out.println(code + ": " + isColourCode(code));
    }

    public static void main(String[] args) {
        show("#E30613");
        show("#e3061");
        show("E306133");
        show("#E3O613");
    }
}

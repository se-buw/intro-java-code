// @run
/** A method with three parameters: a sheet name and its width and height in mm. */
public class PrintSize {
    // region method
    public static void show(String sheet, int width, int height) {
        System.out.println(sheet + ": " + width + " x " + height);
    }
    // endregion

    public static void main(String[] args) {
        show("A4", 210, 297);
    }
}

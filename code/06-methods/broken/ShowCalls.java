/** Quiz: which calls compile? Arguments are matched by position. */
public class ShowCalls {
    public static void show(String sheet, int width, int height) {
        System.out.println(sheet + ": " + width + " x " + height);
    }

    public static void main(String[] args) {
        // region calls
        show("A4", 297, 210);
        show("A5", 148.5, 210);
        show(148, 210);
        // endregion
    }
}

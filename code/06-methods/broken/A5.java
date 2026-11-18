/** The arguments must match the parameters in number, order and type. */
public class A5 {
    public static void show(String sheet, int width, int height) {
        System.out.println(sheet + ": " + width + " x " + height);
    }

    public static void main(String[] args) {
        show("A5", 148.5, 210);
    }
}

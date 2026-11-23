// @run
/** Passes an array, and anonymous arrays, to a method that adds up a Mensa tray. */
public class Tray {
    // region total
    public static int total(int[] cents) {
        int sum = 0;
        for (int price : cents) {
            sum += price;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] tray = {390, 120, 95};
        System.out.println(total(tray));
        System.out.println(total(new int[] {250, 165}));
        System.out.println(total(new int[0]));
    }
    // endregion
}

// @run
/** Rounds a type size in millimetres to tenths of a millimetre. */
public class RoundTenths {
    public static void main(String[] args) {
        // region round
        double millimetres = 11 / 72.0 * 25.4;   // 11 pt
        System.out.println(millimetres);

        double cut = (int) (millimetres * 10) / 10.0;
        System.out.println(cut);

        double rounded = Math.round(millimetres * 10) / 10.0;
        System.out.println(rounded);
        // endregion
    }
}

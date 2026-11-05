/** The classic way with Math.random(): a double in [0.0, 1.0). */
public class LegacyRandom {
    public static void main(String[] args) {
        // region legacy
        double r = Math.random();              // 0.0 <= r < 1.0
        int dice = (int) (Math.random() * 6) + 1;  // 1 to 6
        int value = 10 + (int) (Math.random() * 11); // 10 to 20
        // endregion
        System.out.println(r + " " + dice + " " + value);
    }
}

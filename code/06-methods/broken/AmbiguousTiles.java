/** Two overloads fit equally well: the call is ambiguous. */
public class AmbiguousTiles {
    public static double tiles(int length, double tile) {
        return Math.ceil(length / tile);
    }

    public static double tiles(double length, int tile) {
        return Math.ceil(length / tile);
    }

    public static void main(String[] args) {
        System.out.println(tiles(250, 30));
    }
}

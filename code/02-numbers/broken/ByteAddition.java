/** level + 1 is an int: it does not fit back into a byte. */
public class ByteAddition {
    public static void main(String[] args) {
        byte level = 10;
        level = level + 1;
        System.out.println(level);
    }
}

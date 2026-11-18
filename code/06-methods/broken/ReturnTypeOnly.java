/** Methods cannot differ only in their return type. */
public class ReturnTypeOnly {
    public static int half(int n) {
        return n / 2;
    }

    public static double half(int n) {
        return n / 2.0;
    }
}

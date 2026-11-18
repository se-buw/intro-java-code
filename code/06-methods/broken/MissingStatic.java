/** A method without static cannot be called from static main. */
public class MissingStatic {
    public long square(int n) {
        return (long) n * n;
    }

    public static void main(String[] args) {
        System.out.println(square(12));
    }
}

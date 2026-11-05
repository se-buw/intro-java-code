/** Reads a line with IO.readln (Java 25). */
public class ReadLineIO {
    public static void main(String[] args) {
        // region io
        String street = IO.readln("Street: ");
        IO.println(street.toLowerCase());
        // endregion
    }
}

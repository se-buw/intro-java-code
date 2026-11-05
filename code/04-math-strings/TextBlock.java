// @run
/** A poster text as a text block (Java 15+). */
public class TextBlock {
    public static void main(String[] args) {
        // region block
        String poster = """
                bauhaus ausstellung
                  "kunst und technik"
                weimar, %d
                """.formatted(1923);
        System.out.print(poster);
        // endregion
    }
}

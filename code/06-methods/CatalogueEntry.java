// @run
/** Three methods with the same name and different parameter lists. */
public class CatalogueEntry {
    // region overloads
    public static String entry(String title) {
        return title + " (undated)";
    }

    public static String entry(String title, int year) {
        return title + " (" + year + ")";
    }

    public static String entry(String title, int from, int to) {
        return title + " (" + from + "-" + to + ")";
    }
    // endregion

    public static void main(String[] args) {
        System.out.println(entry("tea infuser MT 49", 1924));
        System.out.println(entry("Bauhaus building", 1925, 1926));
        System.out.println(entry("weaving sample"));
    }
}

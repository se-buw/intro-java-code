// @run
/** A multi-way if-else statement: where was the Bauhaus in a given year? */
public class BauhausCity {
    public static void main(String[] args) {
        int year = 1927;
        // region if
        String city;
        if (year >= 1934) {
            city = "none, closed in 1933";
        } else if (year >= 1932) {
            city = "Berlin";
        } else if (year >= 1925) {
            city = "Dessau";
        } else if (year >= 1919) {
            city = "Weimar";
        } else {
            city = "none, founded in 1919";
        }
        // endregion
        System.out.println(year + ": " + city);
    }
}

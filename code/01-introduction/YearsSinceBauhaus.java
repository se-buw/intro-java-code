/**
 * Prints how many years ago the Bauhaus was founded in Weimar.
 */
public class YearsSinceBauhaus {
    public static void main(String[] args) {
        int foundingYear = 1919;
        int thisYear = 2026;
        int years = thisYear - foundingYear;
        System.out.println("Bauhaus: " + years + " years");
    }
}

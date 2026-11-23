// @run
/** A method with a variable number of arguments: the makers of a design. */
public class Credits {
    // region credits
    public static void credits(String work, String... makers) {
        if (makers.length == 0) {
            System.out.println(work + ": maker unknown");
            return;
        }
        System.out.println(work + " by " + String.join(" and ", makers));
    }
    // endregion

    public static void main(String[] args) {
        // region calls
        credits("Tea infuser", "Marianne Brandt");
        credits("Fagus factory", "Gropius", "Meyer");
        String[] team = {"Gropius", "Meyer"};
        credits("Haus Sommerfeld", team);
        credits("Wall hanging");
        // endregion
    }
}

// @run
/** Prints three door signs by copying the same statements three times. */
public class SignsRepeated {
    public static void main(String[] args) {
        // region repeated
        String room = "weaving";
        String bar = "-".repeat(room.length() + 2);
        System.out.println("+" + bar + "+");
        System.out.println("| " + room + " |");
        System.out.println("+" + bar + "+");
        room = "pottery";
        bar = "-".repeat(room.length() + 2);
        System.out.println("+" + bar + "+");
        System.out.println("| " + room + " |");
        System.out.println("+" + bar + "+");
        room = "metal";
        bar = "-".repeat(room.length());
        System.out.println("+" + bar + "+");
        System.out.println("| " + room + " |");
        System.out.println("+" + bar + "+");
        // endregion
    }
}

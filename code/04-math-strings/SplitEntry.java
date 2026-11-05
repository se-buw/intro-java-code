import java.util.Scanner;

/** Splits an entry like "weaving: Gunta Stölzl" at the colon. */
public class SplitEntry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entry: ");
        // region split
        String entry = input.nextLine();
        int colon = entry.indexOf(':');
        String workshop = entry.substring(0, colon);
        String master = entry.substring(colon + 1).strip();
        int space = master.lastIndexOf(' ');
        String surname = master.substring(space + 1);
        System.out.println("Workshop: " + workshop);
        System.out.println("Master:   " + master);
        System.out.println("Surname:  " + surname);
        // endregion
    }
}

import java.util.Scanner;

/** Sends a student to one of three hand-in tables of the Vorkurs show, by surname. */
public class HandInTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Surname: ");
        String name = input.next();
        // region table
        char initial = Character.toUpperCase(name.charAt(0));
        if (initial < 'A' || initial > 'Z') {
            System.out.println("Please start with a letter from A to Z");
        } else {
            int table = (initial - 'A') / 9;           // A-I: 0, J-R: 1, S-Z: 2
            char first = (char) ('A' + 9 * table);     // first letter of that table
            char last = (char) Math.min('Z', first + 8);
            System.out.println(name + ": table " + (table + 1) + " (" + first + "-" + last + ")");
        }
        // endregion
    }
}

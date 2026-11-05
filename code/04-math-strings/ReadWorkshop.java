import java.util.Scanner;

/** Reads two words, then a whole line. */
public class ReadWorkshop {
    public static void main(String[] args) {
        // region read
        Scanner input = new Scanner(System.in);
        System.out.print("Workshop and city: ");
        String workshop = input.next();
        String city = input.next();
        input.nextLine();  // skip the rest of the line
        System.out.print("Head: ");
        String head = input.nextLine();
        System.out.println(workshop + " in " + city);
        System.out.println("led by " + head);
        // endregion
    }
}

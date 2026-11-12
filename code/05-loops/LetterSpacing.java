import java.util.Scanner;

/** Letter-spaces a title for a poster: lowercase, without punctuation. */
public class LetterSpacing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Title: ");
        String title = input.nextLine();

        // region loop
        String spaced = "";
        for (int i = 0; i < title.length(); i++) {
            char c = Character.toLowerCase(title.charAt(i));
            if (!Character.isLetterOrDigit(c) && c != ' ') {
                continue;  // drop punctuation
            }
            spaced = spaced + c + " ";
        }
        // endregion
        System.out.println(spaced.strip());
    }
}

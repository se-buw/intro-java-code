import java.util.Scanner;

/** Checks whether a word starts with a capital letter, using a range test. */
public class BayerStyle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Word: ");
        String word = input.next();
        // region ranges
        char first = word.charAt(0);
        if (first >= 'A' && first <= 'Z') {
            System.out.println(word + ": starts with a capital letter");
        } else {
            System.out.println(word + ": all lowercase, as Bayer wants it");
        }
        // endregion
    }
}

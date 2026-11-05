// @run
/** Printing chars and ints. */
public class CharQuiz {
    public static void main(String[] args) {
        // region quiz
        char letter = 'a';
        System.out.println(letter);
        System.out.println(letter + 1);
        System.out.println((char) (letter + 1));
        letter++;
        System.out.println(letter);
        System.out.println('B' + 'C');
        System.out.println("" + 'B' + 'C');
        // endregion
    }
}

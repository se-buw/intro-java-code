// @run
/** while or do-while: what are the values after each loop? */
public class DoWhileQuiz {
    public static void main(String[] args) {
        // region a
        int a = 10;
        while (a < 10) {
            a++;
        }
        // endregion
        // region b
        int b = 10;
        do {
            b++;
        } while (b < 10);
        // endregion
        // region c
        int c = 10;
        do {
            c--;
        } while (c < 10);
        // endregion
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}

// @run
/** How often does each loop body run? */
public class LoopQuiz {
    public static void main(String[] args) {
        // region a
        int a = 0;
        int countA = 0;
        while (a < 3) {
            a++;
            countA++;
        }
        // endregion
        // region b
        int b = 0;
        int countB = 0;
        while (b <= 3) {
            b++;
            countB++;
        }
        // endregion
        // region c
        int c = 1;
        int countC = 0;
        while (c > 0) {
            c++;
            countC++;
        }
        // endregion
        System.out.println("a: " + countA);
        System.out.println("b: " + countB);
        System.out.println("c: " + countC + " (c is now " + c + ")");
    }
}

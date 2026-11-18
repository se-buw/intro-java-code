// @run
/** What happens to an argument when the method changes its parameter? */
public class BowlQuiz {
    // region quiz
    public static void main(String[] args) {
        int clay = 10;  // kg in the pottery store
        int used = makeBowl(clay);
        System.out.println(clay + " kg left, " + used + " kg used");
    }

    public static int makeBowl(int clay) {
        clay = clay - 2;  // a bowl needs 2 kg
        return 2;
    }
    // endregion
}

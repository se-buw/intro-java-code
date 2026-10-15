// @run
/** A weighted course grade: two exams, a project and bonus points. */
public class Formula {
    public static void main(String[] args) {
        double exam1 = 2.3;
        double exam2 = 1.7;
        double project = 1.0;
        int bonus = 3;
        // region formula
        double grade = (2 * (exam1 + exam2) + 3 * project) / 7
                - bonus / 10.0;
        // endregion
        System.out.println(grade);
    }
}

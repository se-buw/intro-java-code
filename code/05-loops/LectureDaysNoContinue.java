// @run
/** LectureDays without continue: the negated condition guards the count. */
public class LectureDaysNoContinue {
    public static void main(String[] args) {
        int weekdays = 0;
        for (int day = 1; day <= 14; day++) {
            // region if
            if (!(day % 7 == 6 || day % 7 == 0)) {
                weekdays++;
            }
            // endregion
        }
        System.out.println("Weekdays: " + weekdays);
    }
}

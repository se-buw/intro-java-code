// @run
/** Counts the weekdays in the first two weeks of the semester (day 1 is a Monday). */
public class LectureDays {
    public static void main(String[] args) {
        // region loop
        int weekdays = 0;
        for (int day = 1; day <= 14; day++) {
            if (day % 7 == 6 || day % 7 == 0) {
                continue;  // skip weekend
            }
            weekdays++;
        }
        // endregion
        System.out.println("Weekdays: " + weekdays);
    }
}

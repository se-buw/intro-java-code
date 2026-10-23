// @run
import java.time.LocalDate;

/** Is the semester ticket valid on a given day? */
public class SemesterTicket {
    public static void main(String[] args) {
        // region ticket
        LocalDate start = LocalDate.of(2026, 10, 1);
        LocalDate end = LocalDate.of(2027, 3, 31);
        LocalDate day = LocalDate.of(2027, 4, 2);

        boolean isValid = !day.isBefore(start)
                && !day.isAfter(end);
        if (isValid) {
            System.out.println("Have a nice trip!");
        } else {
            System.out.println("Ticket not valid on "
                    + day);
        }
        // endregion
    }
}

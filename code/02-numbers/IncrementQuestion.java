// @run
/** Increment inside an expression: numbers from a ticket machine. */
public class IncrementQuestion {
    public static void main(String[] args) {
        // region inc
        int ticket = 41;
        int anna = ticket++;
        int ben = ++ticket;

        System.out.println("Anna:   " + anna);
        System.out.println("Ben:    " + ben);
        System.out.println("ticket: " + ticket);
        // endregion
    }
}

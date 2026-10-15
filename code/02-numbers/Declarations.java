// @run
/** Declaring, assigning and initializing variables. */
public class Declarations {
    public static void main(String[] args) {
        // region declare
        int seats;            // declaration
        seats = 120;          // assignment
        seats = seats + 30;   // read, compute, store

        double height = 3.2;  // declare + initialize
        int rows = 10, columns = 15;

        System.out.println(seats + " seats");
        System.out.println(rows * columns + " spots");
        System.out.println(height + " m high");
        // endregion
    }
}

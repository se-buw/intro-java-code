/** A name must be declared before it is used: typos count. */
public class UndeclaredVariable {
    public static void main(String[] args) {
        int seatsPerRow = 15;
        int seats = seatPerRow * 8;
        System.out.println(seats);
    }
}

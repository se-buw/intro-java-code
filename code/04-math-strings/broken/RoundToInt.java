/** Math.round(double) returns a long, not an int. */
public class RoundToInt {
    public static void main(String[] args) {
        double price = 3.6;
        int euros = Math.round(price);
        System.out.println(euros);
    }
}

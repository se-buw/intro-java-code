/** A double result cannot be stored in an int without a cast. */
public class LossyConversion {
    public static void main(String[] args) {
        int x = 5 / 2.0;
        System.out.println(x);
    }
}

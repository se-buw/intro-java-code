/** Not every expression may stand alone as a statement. */
public class NotAStatement {
    public static void main(String[] args) {
        int price = 350;
        price + 50;
        System.out.println(price);
    }
}

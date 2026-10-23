// @run
/** Mensa price with a classic switch statement. */
public class FallThrough {
    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
        // region switch
        int status = 1;  // student
        int price = 0;
        switch (status) {
            case 1:
                price = 320;
            case 2:
                price = 510;
                break;
            case 3:
                price = 640;
                break;
        }
        System.out.println(price + " cents");
        // endregion
    }
}

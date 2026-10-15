// @run
/** Share of vegetarian dishes among all dishes sold in the Mensa. */
public class VeggieShare {
    public static void main(String[] args) {
        // region share
        int vegetarian = 180;
        int dishes = 450;

        double share = vegetarian / dishes * 100;
        System.out.println(share + " %");

        double correct = 100.0 * vegetarian / dishes;
        System.out.println(correct + " %");
        // endregion
    }
}

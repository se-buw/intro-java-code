// @run
/** A named constant for the VAT rate. */
public class VatConstant {
    public static void main(String[] args) {
        // region constant
        final double VAT_RATE = 0.19;

        double netPrice = 25.0;   // poster print, EUR
        double vat = netPrice * VAT_RATE;
        System.out.println("VAT: " + vat + " EUR");
        // endregion
    }
}

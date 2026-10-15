/** A final variable cannot be assigned a second time. */
public class ChangeConstant {
    public static void main(String[] args) {
        final double VAT_RATE = 0.19;
        VAT_RATE = 0.07;
        System.out.println(VAT_RATE);
    }
}

import java.util.Locale;
import java.util.Scanner;

/** A Scanner that reads numbers with a decimal point on every computer. */
public class RootLocale {
    public static void main(String[] args) {
        // region scanner
        Scanner input = new Scanner(System.in).useLocale(Locale.ROOT);
        // endregion
        System.out.print("Height in m: ");
        double height = input.nextDouble();
        System.out.println(height);
    }
}

import java.util.Scanner;

/** Greets visitors of one city. */
public class CityCheck {
    public static void main(String[] args) {
        // region check
        Scanner input = new Scanner(System.in);
        System.out.print("City: ");
        String city = input.next();
        if (city == "Weimar") {
            System.out.println("Welcome home!");
        } else {
            System.out.println("Hello, visitor from " + city);
        }
        // endregion
    }
}

import java.util.Scanner;

/** Splits a colour code like #E30613 into its red, green and blue parts. */
public class HexColor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Colour code: ");
        // region parse
        String code = input.nextLine().strip();
        if (code.length() == 7 && code.startsWith("#")) {
            int red = Integer.parseInt(code.substring(1, 3), 16);
            int green = Integer.parseInt(code.substring(3, 5), 16);
            int blue = Integer.parseInt(code.substring(5, 7), 16);
            System.out.println("red " + red + ", green " + green + ", blue " + blue);
            int grey = (red + green + blue) / 3;
            System.out.printf("as grey: #%02x%02x%02x%n", grey, grey, grey);
        } else {
            System.out.println("Expected # and six hex digits: " + code);
        }
        // endregion
    }
}

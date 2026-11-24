import java.util.Scanner;

/** The kiln program reads the number of cracked cups instead of fixing it in the code. */
public class KilnCracked {
    public static void main(String[] args) {
        int cupsPerFiring = 24;
        int firings = 3;
        int cups = cupsPerFiring * firings;
        // region input
        Scanner input = new Scanner(System.in);
        System.out.print("Cracked cups: ");
        int cracked = input.nextInt();
        cups = cups - cracked;
        // endregion
        System.out.println("Cups for sale: " + cups);
    }
}

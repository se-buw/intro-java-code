import java.util.Scanner;

/** Packs chairs into crates and crates onto trucks. */
public class MovingCrates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int PER_CRATE = 6;    // chairs in a crate
        final int PER_TRUCK = 14;   // crates on a truck
        System.out.print("Chairs: ");
        int chairs = input.nextInt();

        // region crates
        int fullCrates = chairs / PER_CRATE;
        int chairsLeft = chairs % PER_CRATE;
        int crates = (chairs + PER_CRATE - 1) / PER_CRATE;
        int trucks = (crates + PER_TRUCK - 1) / PER_TRUCK;
        // endregion

        System.out.println("Full crates: " + fullCrates);
        System.out.println("Chairs left: " + chairsLeft);
        System.out.println("Crates:      " + crates);
        System.out.println("Trucks:      " + trucks);
    }
}

import java.util.Arrays;

/** Prints the next bus after the time given on the command line, e.g. 8:40. */
public class NextBus {
    static final int[] DEPARTURES = {610, 640, 710, 730, 750,
                                     810, 830, 900, 930, 1010};

    // region main
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java NextBus.java 8:40");
            return;
        }
        String[] parts = args[0].split(":");  // {"8", "40"}
        int time = Integer.parseInt(parts[0]) * 100
                + Integer.parseInt(parts[1]);
        int i = Arrays.binarySearch(DEPARTURES, time);
        int next = i >= 0 ? i : -i - 1;  // found or insertion point
        if (next == DEPARTURES.length) {
            System.out.println("No more buses this morning.");
        } else {
            int bus = DEPARTURES[next];
            System.out.printf("Next bus: %d:%02d%n", bus / 100, bus % 100);
        }
    }
    // endregion
}

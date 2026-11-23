// @run
/** Binary search in the sorted departure times of a bus stop. */
public class BinarySearch {
    // region search
    public static int binarySearch(int[] departures, int time) {
        int low = 0;
        int high = departures.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;  // no overflow
            if (time < departures[mid]) {
                high = mid - 1;
            } else if (time > departures[mid]) {
                low = mid + 1;
            } else {
                return mid;  // a bus leaves at this time
            }
        }
        return -low - 1;  // not found: -(insertion point) - 1
    }
    // endregion

    public static void main(String[] args) {
        // region calls
        int[] times = {610, 640, 710, 730, 750,
                       810, 830, 900, 930, 1010};
        System.out.println(binarySearch(times, 840));
        System.out.println(binarySearch(times, 830));
        System.out.println(binarySearch(times, 1100));
        // endregion
    }
}

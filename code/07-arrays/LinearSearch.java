// @run
/** Linear search: looks at one hook of the tool rack after the other. */
public class LinearSearch {
    // region search
    public static int indexOf(String[] rack, String tool) {
        for (int i = 0; i < rack.length; i++) {
            if (rack[i].equals(tool)) {
                return i;
            }
        }
        return -1;  // not on the rack
    }
    // endregion

    public static void main(String[] args) {
        // region calls
        String[] rack = {"saw", "plane", "rasp", "chisel",
                         "mallet", "clamp", "drill"};
        System.out.println(indexOf(rack, "mallet"));
        System.out.println(indexOf(rack, "lathe"));
        // endregion
    }
}

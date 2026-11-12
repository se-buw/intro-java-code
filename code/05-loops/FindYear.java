// @run
/** Finds the first digit in a line of text and reads the year from there. */
public class FindYear {
    public static void main(String[] args) {
        // region loop
        String line = "bauhaus ausstellung weimar 1923";
        int start = -1;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                start = i;
                break;  // leave the loop
            }
        }
        // endregion
        System.out.println("First digit at index " + start);
        System.out.println("Year: " + line.substring(start, start + 4));
    }
}

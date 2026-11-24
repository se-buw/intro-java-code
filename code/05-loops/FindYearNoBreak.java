// @run
/** FindYear without break: the condition of the loop stops it. */
public class FindYearNoBreak {
    public static void main(String[] args) {
        String line = "bauhaus ausstellung weimar 1923";
        // region loop
        int start = -1;
        for (int i = 0; i < line.length() && start == -1; i++) {
            if (Character.isDigit(line.charAt(i))) {
                start = i;
            }
        }
        // endregion
        System.out.println("First digit at index " + start);
    }
}

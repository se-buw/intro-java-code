// region imports
import java.util.Scanner;   // single-type import: one class
import java.util.*;         // on-demand import: all classes of java.util
// endregion

/** The two forms of import. */
public class Imports {
    public static void main(String[] args) {
        Scanner in = new Scanner("2 45");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(in.nextInt());
    }
}

// @args Klee Itten
/** Greets every name given on the command line. */
public class Greeting {
    // region main
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No names given.");
            return;
        }
        for (String name : args) {
            System.out.println("Hello, " + name + "!");
        }
    }
    // endregion
}

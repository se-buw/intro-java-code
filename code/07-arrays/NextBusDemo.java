// @run
/** Runs NextBus with several command-line arguments, as a terminal would. */
public class NextBusDemo {
    public static void main(String[] args) {
        run("8:40");
        run("8:30");
        run("10:50");
        run();
    }

    static void run(String... arguments) {
        System.out.println("> java NextBus.java " + String.join(" ", arguments));
        NextBus.main(arguments);
    }
}

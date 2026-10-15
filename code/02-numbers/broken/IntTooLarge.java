/** An int literal without L must fit into an int. */
public class IntTooLarge {
    public static void main(String[] args) {
        long population = 8_100_000_000;
        System.out.println(population);
    }
}

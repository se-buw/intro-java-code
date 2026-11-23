// @run
/** The enhanced for loop visits every element in order. */
public class ForEach {
    public static void main(String[] args) {
        // region loop
        String[] masters = {"Itten", "Klee", "Kandinsky", "Albers", "Schlemmer"};
        for (String name : masters) {
            System.out.println("Master: " + name);
        }

        int[] prices = {350, 275, 420, 310, 295};  // cents
        int sum = 0;
        for (var price : prices) {
            sum += price;
        }
        System.out.println("Average: " + sum / prices.length + " cents");
        // endregion
    }
}

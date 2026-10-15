/** A local variable must get a value before it is read. */
public class UninitializedVariable {
    public static void main(String[] args) {
        int total;
        total = total + 350;
        System.out.println(total);
    }
}

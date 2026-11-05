/** An int variable cannot be assigned to a char without a cast. */
public class IntToChar {
    public static void main(String[] args) {
        int code = 97;
        char c = code;
        System.out.println(c);
    }
}

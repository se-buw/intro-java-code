/** Where can a local variable be used? */
public class ScopeQuiz {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 3; i++) {
            int square = i * i;
            total += square;
        }
        System.out.println(total + " " + square);
    }
}

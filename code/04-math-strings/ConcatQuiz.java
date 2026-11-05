// @run
/** Concatenation with strings and numbers. */
public class ConcatQuiz {
    public static void main(String[] args) {
        // region quiz
        String name = "Bauhaus";
        System.out.println(name + " " + 19 + 19);
        System.out.println(19 + 19 + " " + name);
        System.out.println(name + " " + (19 + 19));
        System.out.println(name.concat(" Weimar"));
        // endregion
    }
}

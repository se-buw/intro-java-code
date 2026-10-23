// @run
/** The classic switch statement with colons and break. */
public class ClassicSwitch {
    public static void main(String[] args) {
        int month = 11;
        // region switch
        switch (month) {
            case 10: case 11: case 12:
            case 1: case 2: case 3:
                System.out.println("Winter semester");
                break;
            case 4: case 5: case 6:
            case 7: case 8: case 9:
                System.out.println("Summer semester");
                break;
            default:
                System.out.println("No such month");
        }
        // endregion
    }
}

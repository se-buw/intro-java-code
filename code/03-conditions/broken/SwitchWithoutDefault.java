/** Library hours. */
public class SwitchWithoutDefault {
    public static void main(String[] args) {
        int day = 3;
        String hours = switch (day) {
            case 1, 2, 3, 4, 5 -> "8:00-24:00";
            case 6 -> "10:00-20:00";
            case 7 -> "closed";
        };
        System.out.println(hours);
    }
}

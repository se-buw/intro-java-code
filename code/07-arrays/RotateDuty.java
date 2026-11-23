// @run
/** Rotates a weekly duty roster: next week everyone moves one day later. */
public class RotateDuty {
    public static void main(String[] args) {
        // region rotate
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        String[] duty = {"Anna", "Ben", "Clara", "Emil", "Frida"};
        String[] next = new String[duty.length];
        for (int i = 0; i < duty.length; i++) {
            next[(i + 1) % duty.length] = duty[i];  // one day later
        }
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + ": " + duty[i]
                    + " -> " + next[i]);
        }
        // endregion
    }
}

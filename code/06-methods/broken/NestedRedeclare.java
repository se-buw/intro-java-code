/** A local variable cannot be declared again in a nested block. */
public class NestedRedeclare {
    public static int weekCost(int days) {
        int cost = 0;
        for (int d = 1; d <= days; d++) {
            int cost = 350;
            cost += cost;
        }
        return cost;
    }
}

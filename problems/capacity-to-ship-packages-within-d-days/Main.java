import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] weights = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int days = 5;

            int result = sol.shipWithinDays(weights, days);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] weights = new int[]{3, 2, 2, 4, 1, 4};
            int days = 3;

            int result = sol.shipWithinDays(weights, days);
            System.out.println("Example 2: " + result);
        }
    }
}

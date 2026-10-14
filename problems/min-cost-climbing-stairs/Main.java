import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] cost = new int[]{10, 15, 20};

            int result = sol.minCostClimbingStairs(cost);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

            int result = sol.minCostClimbingStairs(cost);
            System.out.println("Example 2: " + result);
        }
    }
}

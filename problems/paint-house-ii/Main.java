import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] costs = new int[][]{new int[]{1, 5, 3}, new int[]{2, 9, 4}};

            int result = sol.minCostII(costs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] costs = new int[][]{new int[]{1, 3}, new int[]{2, 4}};

            int result = sol.minCostII(costs);
            System.out.println("Example 2: " + result);
        }
    }
}

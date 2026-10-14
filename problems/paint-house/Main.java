import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] costs = new int[][]{new int[]{17, 2, 17}, new int[]{16, 16, 5}, new int[]{14, 3, 19}};

            int result = sol.minCost(costs);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] costs = new int[][]{new int[]{7, 6, 2}};

            int result = sol.minCost(costs);
            System.out.println("Example 2: " + result);
        }
    }
}

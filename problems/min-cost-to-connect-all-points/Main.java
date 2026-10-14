import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{0, 0}, new int[]{2, 2}, new int[]{3, 10}, new int[]{5, 2}, new int[]{7, 0}};

            int result = sol.minCostConnectPoints(points);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{3, 12}, new int[]{-2, 5}, new int[]{-4, 1}};

            int result = sol.minCostConnectPoints(points);
            System.out.println("Example 2: " + result);
        }
    }
}

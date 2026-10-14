import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{10, 16}, new int[]{2, 8}, new int[]{1, 6}, new int[]{7, 12}};

            int result = sol.findMinArrowShots(points);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6}, new int[]{7, 8}};

            int result = sol.findMinArrowShots(points);
            System.out.println("Example 2: " + result);
        }
    }
}

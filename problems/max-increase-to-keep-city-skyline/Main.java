import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{3, 0, 8, 4}, new int[]{2, 4, 5, 7}, new int[]{9, 2, 6, 3}, new int[]{0, 3, 1, 0}};

            int result = sol.maxIncreaseKeepingSkyline(grid);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}};

            int result = sol.maxIncreaseKeepingSkyline(grid);
            System.out.println("Example 2: " + result);
        }
    }
}

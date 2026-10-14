import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{1, 3, 1}, new int[]{1, 5, 1}, new int[]{4, 2, 1}};

            int result = sol.minPathSum(grid);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}};

            int result = sol.minPathSum(grid);
            System.out.println("Example 2: " + result);
        }
    }
}

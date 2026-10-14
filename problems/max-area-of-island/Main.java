import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{0, 0, 1, 0}, new int[]{1, 1, 1, 0}, new int[]{0, 1, 0, 1}};

            int result = sol.maxAreaOfIsland(grid);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{0, 0}, new int[]{0, 0}};

            int result = sol.maxAreaOfIsland(grid);
            System.out.println("Example 2: " + result);
        }
    }
}

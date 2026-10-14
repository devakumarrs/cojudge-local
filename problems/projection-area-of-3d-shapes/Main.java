import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{1, 2}, new int[]{3, 4}};

            int result = sol.projectionArea(grid);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{2}};

            int result = sol.projectionArea(grid);
            System.out.println("Example 2: " + result);
        }
    }
}

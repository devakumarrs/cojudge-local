import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{0, 2}, new int[]{1, 3}};

            int result = sol.swimInWater(grid);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{0, 1, 2, 3, 4}, new int[]{24, 23, 22, 21, 5}, new int[]{12, 13, 14, 15, 16}, new int[]{11, 17, 18, 19, 20}, new int[]{10, 9, 8, 7, 6}};

            int result = sol.swimInWater(grid);
            System.out.println("Example 2: " + result);
        }
    }
}

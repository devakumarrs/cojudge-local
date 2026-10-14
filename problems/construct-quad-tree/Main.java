import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{0, 1}, new int[]{1, 0}};

            int[][] result = sol.construct(grid);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] grid = new int[][]{new int[]{1, 1}, new int[]{1, 1}};

            int[][] result = sol.construct(grid);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

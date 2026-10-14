import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] heights = new int[][]{new int[]{1, 2, 2, 3, 5}, new int[]{3, 2, 3, 4, 4}, new int[]{2, 4, 5, 3, 1}, new int[]{6, 7, 1, 4, 5}, new int[]{5, 1, 1, 2, 4}};

            int[][] result = sol.pacificAtlantic(heights);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] heights = new int[][]{new int[]{1}};

            int[][] result = sol.pacificAtlantic(heights);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

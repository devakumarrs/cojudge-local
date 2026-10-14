import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{9, 9, 4}, new int[]{6, 6, 8}, new int[]{2, 1, 1}};

            int result = sol.longestIncreasingPath(matrix);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{3, 4, 5}, new int[]{3, 2, 6}, new int[]{2, 2, 1}};

            int result = sol.longestIncreasingPath(matrix);
            System.out.println("Example 2: " + result);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{2, 1, 3}, new int[]{6, 5, 4}, new int[]{7, 8, 9}};

            int result = sol.minFallingPathSum(matrix);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{-19, 57}, new int[]{-40, -5}};

            int result = sol.minFallingPathSum(matrix);
            System.out.println("Example 2: " + result);
        }
    }
}

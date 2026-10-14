import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};

            int[][] result = sol.transpose(matrix);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}};

            int[][] result = sol.transpose(matrix);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

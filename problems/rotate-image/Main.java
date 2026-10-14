import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};

            int[][] result = sol.rotate(matrix);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{5, 1, 9, 11}, new int[]{2, 4, 8, 10}, new int[]{13, 3, 6, 7}, new int[]{15, 14, 12, 16}};

            int[][] result = sol.rotate(matrix);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

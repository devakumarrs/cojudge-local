import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 3, 5, 7}, new int[]{10, 11, 16, 20}, new int[]{23, 30, 34, 60}};
            int target = 3;

            boolean result = sol.searchMatrix(matrix, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 3, 5, 7}, new int[]{10, 11, 16, 20}, new int[]{23, 30, 34, 60}};
            int target = 13;

            boolean result = sol.searchMatrix(matrix, target);
            System.out.println("Example 2: " + result);
        }
    }
}

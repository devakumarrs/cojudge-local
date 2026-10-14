import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 4, 7, 11, 15}, new int[]{2, 5, 8, 12, 19}, new int[]{3, 6, 9, 16, 22}, new int[]{10, 13, 14, 17, 24}, new int[]{18, 21, 23, 26, 30}};
            int target = 5;

            boolean result = sol.searchMatrix(matrix, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 4, 7, 11, 15}, new int[]{2, 5, 8, 12, 19}, new int[]{3, 6, 9, 16, 22}, new int[]{10, 13, 14, 17, 24}, new int[]{18, 21, 23, 26, 30}};
            int target = 20;

            boolean result = sol.searchMatrix(matrix, target);
            System.out.println("Example 2: " + result);
        }
    }
}

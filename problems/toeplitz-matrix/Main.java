import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 1, 2, 3}, new int[]{9, 5, 1, 2}};

            boolean result = sol.isToeplitzMatrix(matrix);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 2}, new int[]{2, 2}};

            boolean result = sol.isToeplitzMatrix(matrix);
            System.out.println("Example 2: " + result);
        }
    }
}

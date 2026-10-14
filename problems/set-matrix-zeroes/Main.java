import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 1, 1}, new int[]{1, 0, 1}, new int[]{1, 1, 1}};

            int[][] result = sol.setZeroes(matrix);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{0, 1, 2, 0}, new int[]{3, 4, 5, 2}, new int[]{1, 3, 1, 5}};

            int[][] result = sol.setZeroes(matrix);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

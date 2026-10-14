import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};

            int[] result = sol.spiralOrder(matrix);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10, 11, 12}};

            int[] result = sol.spiralOrder(matrix);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}

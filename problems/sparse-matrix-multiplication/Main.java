import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] mat1 = new int[][]{new int[]{1, 0, 0}, new int[]{-1, 0, 3}};
            int[][] mat2 = new int[][]{new int[]{7, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 1}};

            int[][] result = sol.multiply(mat1, mat2);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] mat1 = new int[][]{new int[]{0}};
            int[][] mat2 = new int[][]{new int[]{0}};

            int[][] result = sol.multiply(mat1, mat2);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

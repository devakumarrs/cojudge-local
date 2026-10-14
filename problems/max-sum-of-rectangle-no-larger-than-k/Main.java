import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 0, 1}, new int[]{0, -2, 3}};
            int k = 2;

            int result = sol.maxSumSubmatrix(matrix, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{2, 2, -1}};
            int k = 3;

            int result = sol.maxSumSubmatrix(matrix, k);
            System.out.println("Example 2: " + result);
        }
    }
}

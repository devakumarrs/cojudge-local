import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{1, 5, 9}, new int[]{10, 11, 13}, new int[]{12, 13, 15}};
            int k = 8;

            int result = sol.kthSmallest(matrix, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] matrix = new int[][]{new int[]{-5}};
            int k = 1;

            int result = sol.kthSmallest(matrix, k);
            System.out.println("Example 2: " + result);
        }
    }
}

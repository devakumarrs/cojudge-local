import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int k = 3;
            int[][] rowConditions = new int[][]{new int[]{1, 2}, new int[]{3, 2}};
            int[][] colConditions = new int[][]{new int[]{2, 1}, new int[]{3, 2}};

            int[][] result = sol.buildMatrix(k, rowConditions, colConditions);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int k = 3;
            int[][] rowConditions = new int[][]{new int[]{1, 2}, new int[]{2, 3}, new int[]{3, 1}, new int[]{2, 3}};
            int[][] colConditions = new int[][]{new int[]{2, 1}};

            int[][] result = sol.buildMatrix(k, rowConditions, colConditions);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

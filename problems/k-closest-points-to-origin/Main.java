import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{1, 3}, new int[]{-2, 2}};
            int k = 1;

            int[][] result = sol.kClosest(points, k);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] points = new int[][]{new int[]{3, 3}, new int[]{5, -1}, new int[]{-2, 4}};
            int k = 2;

            int[][] result = sol.kClosest(points, k);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

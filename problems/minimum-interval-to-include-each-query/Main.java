import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{1, 4}, new int[]{2, 4}, new int[]{3, 6}, new int[]{4, 4}};
            int[] queries = new int[]{2, 3, 4, 5};

            int[] result = sol.minInterval(intervals, queries);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{2, 3}, new int[]{2, 5}, new int[]{1, 8}, new int[]{20, 25}};
            int[] queries = new int[]{2, 19, 5, 22};

            int[] result = sol.minInterval(intervals, queries);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}

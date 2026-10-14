import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{1, 3}, new int[]{6, 9}};
            int[] newInterval = new int[]{2, 5};

            int[][] result = sol.insert(intervals, newInterval);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{1, 2}, new int[]{3, 5}, new int[]{6, 7}, new int[]{8, 10}, new int[]{12, 16}};
            int[] newInterval = new int[]{4, 8};

            int[][] result = sol.insert(intervals, newInterval);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

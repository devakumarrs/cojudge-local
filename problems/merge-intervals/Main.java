import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}, new int[]{15, 18}};

            int[][] result = sol.merge(intervals);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{1, 4}, new int[]{4, 5}};

            int[][] result = sol.merge(intervals);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

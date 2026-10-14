import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{1, 2}};

            int[] result = sol.findRightInterval(intervals);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[][] intervals = new int[][]{new int[]{3, 4}, new int[]{2, 3}, new int[]{1, 2}};

            int[] result = sol.findRightInterval(intervals);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] values = new int[]{1, 3, 7, 2, 6};

            int[][] result = sol.runSummaryRanges(values);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] values = new int[]{1};

            int[][] result = sol.runSummaryRanges(values);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 4};
            int[][] queries = new int[][]{new int[]{1, 0}, new int[]{-3, 1}, new int[]{-4, 0}, new int[]{2, 3}};

            int[] result = sol.sumEvenAfterQueries(nums, queries);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1};
            int[][] queries = new int[][]{new int[]{4, 0}};

            int[] result = sol.sumEvenAfterQueries(nums, queries);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}

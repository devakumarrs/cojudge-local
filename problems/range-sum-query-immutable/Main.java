import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
            int[][] queries = new int[][]{new int[]{0, 2}, new int[]{2, 5}, new int[]{0, 5}};

            int[] result = sol.runNumArray(nums, queries);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1};
            int[][] queries = new int[][]{new int[]{0, 0}};

            int[] result = sol.runNumArray(nums, queries);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}

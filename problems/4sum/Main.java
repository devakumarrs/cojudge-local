import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 0, -1, 0, -2, 2};
            int target = 0;

            int[][] result = sol.fourSum(nums, target);
            System.out.println("Example 1: " + Arrays.deepToString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 2, 2, 2, 2};
            int target = 8;

            int[][] result = sol.fourSum(nums, target);
            System.out.println("Example 2: " + Arrays.deepToString(result));
        }
    }
}

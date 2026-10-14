import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{4, 3, 2, 3, 5, 2, 1};
            int k = 4;

            boolean result = sol.canPartitionKSubsets(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 4};
            int k = 3;

            boolean result = sol.canPartitionKSubsets(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

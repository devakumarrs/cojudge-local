import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 1, 1, 1, 1};
            int target = 3;

            int result = sol.findTargetSumWays(nums, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1};
            int target = 1;

            int result = sol.findTargetSumWays(nums, target);
            System.out.println("Example 2: " + result);
        }
    }
}

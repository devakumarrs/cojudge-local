import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{23, 2, 4, 6, 7};
            int k = 6;

            boolean result = sol.checkSubarraySum(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{23, 2, 6, 4, 7};
            int k = 6;

            boolean result = sol.checkSubarraySum(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

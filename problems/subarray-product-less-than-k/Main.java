import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{10, 5, 2, 6};
            int k = 100;

            int result = sol.numSubarrayProductLessThanK(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3};
            int k = 0;

            int result = sol.numSubarrayProductLessThanK(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

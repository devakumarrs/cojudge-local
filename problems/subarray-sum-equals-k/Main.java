import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 1, 1};
            int k = 2;

            int result = sol.subarraySum(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3};
            int k = 3;

            int result = sol.subarraySum(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

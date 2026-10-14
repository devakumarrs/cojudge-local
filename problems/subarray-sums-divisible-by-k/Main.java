import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{4, 5, 0, -2, -3, 1};
            int k = 5;

            int result = sol.subarraysDivByK(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{5};
            int k = 9;

            int result = sol.subarraysDivByK(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

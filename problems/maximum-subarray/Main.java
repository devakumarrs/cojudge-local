import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

            int result = sol.maxSubArray(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1};

            int result = sol.maxSubArray(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

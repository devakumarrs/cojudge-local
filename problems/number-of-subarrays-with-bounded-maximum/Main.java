import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 1, 4, 3};
            int left = 2;
            int right = 3;

            int result = sol.numSubarrayBoundedMax(nums, left, right);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 9, 2, 5, 6};
            int left = 2;
            int right = 8;

            int result = sol.numSubarrayBoundedMax(nums, left, right);
            System.out.println("Example 2: " + result);
        }
    }
}

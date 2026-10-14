import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 2, 1, 5, 6, 4};
            int k = 2;

            int result = sol.findKthLargest(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
            int k = 4;

            int result = sol.findKthLargest(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

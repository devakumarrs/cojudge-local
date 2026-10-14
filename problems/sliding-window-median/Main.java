import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;

            List<String> result = sol.medianSlidingWindow(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 4, 2, 3, 1, 4, 2};
            int k = 3;

            List<String> result = sol.medianSlidingWindow(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

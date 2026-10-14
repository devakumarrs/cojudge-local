import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1};
            int k = 1;

            int result = sol.shortestSubarray(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2};
            int k = 4;

            int result = sol.shortestSubarray(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

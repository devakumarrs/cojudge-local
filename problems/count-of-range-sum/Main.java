import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-2, 5, -1};
            int lower = -2;
            int upper = 2;

            int result = sol.countRangeSum(nums, lower, upper);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0};
            int lower = 0;
            int upper = 0;

            int result = sol.countRangeSum(nums, lower, upper);
            System.out.println("Example 2: " + result);
        }
    }
}

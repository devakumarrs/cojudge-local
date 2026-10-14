import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{5, 7, 7, 8, 8, 10};
            int target = 8;

            int[] result = sol.searchRange(nums, target);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{5, 7, 7, 8, 8, 10};
            int target = 6;

            int[] result = sol.searchRange(nums, target);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}

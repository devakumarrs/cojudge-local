import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 7, 11, 15};
            int target = 9;

            int[] result = sol.twoSum(nums, target);
            System.out.println("Example 1: " + Arrays.toString(result));
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 2, 4};
            int target = 6;

            int[] result = sol.twoSum(nums, target);
            System.out.println("Example 2: " + Arrays.toString(result));
        }
    }
}

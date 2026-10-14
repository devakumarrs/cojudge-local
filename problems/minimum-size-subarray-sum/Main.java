import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int target = 7;
            int[] nums = new int[]{2, 3, 1, 2, 4, 3};

            int result = sol.minSubArrayLen(target, nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int target = 4;
            int[] nums = new int[]{1, 4, 4};

            int result = sol.minSubArrayLen(target, nums);
            System.out.println("Example 2: " + result);
        }
    }
}

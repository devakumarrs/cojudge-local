import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
            int target = 0;

            boolean result = sol.search(nums, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
            int target = 3;

            boolean result = sol.search(nums, target);
            System.out.println("Example 2: " + result);
        }
    }
}

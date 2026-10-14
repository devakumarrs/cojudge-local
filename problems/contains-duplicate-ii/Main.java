import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 1};
            int k = 3;

            boolean result = sol.containsNearbyDuplicate(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 0, 1, 1};
            int k = 1;

            boolean result = sol.containsNearbyDuplicate(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

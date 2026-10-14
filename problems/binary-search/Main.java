import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
            int target = 9;

            int result = sol.search(nums, target);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
            int target = 2;

            int result = sol.search(nums, target);
            System.out.println("Example 2: " + result);
        }
    }
}

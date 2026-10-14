import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 3};
            int n = 6;

            int result = sol.minPatches(nums, n);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 5, 10};
            int n = 20;

            int result = sol.minPatches(nums, n);
            System.out.println("Example 2: " + result);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 2, 3};

            boolean result = sol.isMonotonic(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{6, 5, 4, 4};

            boolean result = sol.isMonotonic(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

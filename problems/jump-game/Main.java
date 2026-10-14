import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{2, 3, 1, 1, 4};

            boolean result = sol.canJump(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 2, 1, 0, 4};

            boolean result = sol.canJump(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

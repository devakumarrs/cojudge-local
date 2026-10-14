import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 5, 11, 5};

            boolean result = sol.canPartition(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 5};

            boolean result = sol.canPartition(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

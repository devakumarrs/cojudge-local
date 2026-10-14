import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 4};

            boolean result = sol.find132pattern(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 1, 4, 2};

            boolean result = sol.find132pattern(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{4, 6, 15, 35};

            int result = sol.largestComponentSize(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{20, 50, 9, 63};

            int result = sol.largestComponentSize(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

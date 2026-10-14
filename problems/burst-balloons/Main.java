import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 1, 5, 8};

            int result = sol.maxCoins(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 5};

            int result = sol.maxCoins(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

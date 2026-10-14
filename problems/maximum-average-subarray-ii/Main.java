import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 12, -5, -6, 50, 3};
            int k = 4;

            String result = sol.findMaxAverage(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{5};
            int k = 1;

            String result = sol.findMaxAverage(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

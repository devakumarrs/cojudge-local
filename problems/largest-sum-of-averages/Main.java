import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{9, 1, 2, 3, 9};
            int k = 3;

            String result = sol.largestSumOfAverages(nums, k);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
            int k = 4;

            String result = sol.largestSumOfAverages(nums, k);
            System.out.println("Example 2: " + result);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

            boolean result = sol.splitArraySameAverage(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{3, 1};

            boolean result = sol.splitArraySameAverage(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

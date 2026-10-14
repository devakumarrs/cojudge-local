import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};

            int result = sol.lengthOfLIS(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 1, 0, 3, 2, 3};

            int result = sol.lengthOfLIS(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

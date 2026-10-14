import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{100, 4, 200, 1, 3, 2};

            int result = sol.longestConsecutive(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

            int result = sol.longestConsecutive(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

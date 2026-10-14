import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 1, 3, 50, 75};
            int lower = 0;
            int upper = 99;

            List<String> result = sol.findMissingRanges(nums, lower, upper);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{};
            int lower = 1;
            int upper = 1;

            List<String> result = sol.findMissingRanges(nums, lower, upper);
            System.out.println("Example 2: " + result);
        }
    }
}

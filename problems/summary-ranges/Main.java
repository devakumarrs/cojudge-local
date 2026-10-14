import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 1, 2, 4, 5, 7};

            List<String> result = sol.summaryRanges(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{0, 2, 3, 4, 6, 8, 9};

            List<String> result = sol.summaryRanges(nums);
            System.out.println("Example 2: " + result);
        }
    }
}

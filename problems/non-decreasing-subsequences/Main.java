import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{4, 6, 7, 7};

            List<List<Integer>> result = sol.findSubsequences(nums);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            int[] nums = new int[]{4, 4, 3, 2, 1};

            List<List<Integer>> result = sol.findSubsequences(nums);
            System.out.println("Example 2: " + result);
        }
    }
}
